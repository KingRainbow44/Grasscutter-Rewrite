package io.grasscutter.server.http.routers;

import static io.grasscutter.utils.DataUtils.lr;
import static io.grasscutter.utils.definitions.Configuration.RunMode.HYBRID;

import com.google.protobuf.ByteString;
import io.grasscutter.proto.QueryRegionListHttpRspOuterClass.QueryRegionListHttpRsp;
import io.grasscutter.proto.RegionSimpleInfoOuterClass.RegionSimpleInfo;
import io.grasscutter.server.http.Router;
import io.grasscutter.utils.EncodingUtils;
import io.grasscutter.utils.NetworkUtils;
import io.grasscutter.utils.constants.CryptoConstants;
import io.grasscutter.utils.constants.Log;
import io.grasscutter.utils.constants.NetworkConstants;
import io.grasscutter.utils.constants.Properties;
import io.grasscutter.utils.definitions.Configuration;
import io.grasscutter.utils.definitions.QueryRegionResponse;
import io.grasscutter.utils.enums.KeyType;
import io.grasscutter.utils.objects.RegionData;
import io.grasscutter.utils.objects.lang.TextContainer;
import io.javalin.Javalin;
import io.javalin.http.Context;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* Handles region query (dispatch) requests. */
public final class DispatchRouter implements Router {
    private final Map<String, RegionData> regions = new HashMap<>();
    private String regionListResponse = "";

    public DispatchRouter() {
        try {
            // Initialize region data.
            this.initialize();
        } catch (IllegalStateException exception) {
            // Log the exception.
            Log.error(new TextContainer("exception.error"), exception);
        }
    }

    /** Initializes region data. */
    private void initialize() {
        // Fetch properties.
        var dispatch = Properties.DISPATCH();
        var server = Properties.SERVER();
        var game = server.gameServer;

        // Get the access URL.
        var accessUrl = NetworkUtils.formulateUrl(dispatch, server.httpServer);
        // Create lists.
        var servers = new ArrayList<RegionSimpleInfo>();
        var usedNames = new ArrayList<String>();

        // Validate server config.
        if (server.runAs != HYBRID && dispatch.regions.size() < 1) {
            throw new IllegalStateException("No regions defined.");
        }
        if (dispatch.regions.size() < 1) {
            // Create a default region if none are defined.
            dispatch.regions.add(
                    new Configuration.Region()
                            .setName("os_usa")
                            .setDisplay(dispatch.defaultRegionDisplay)
                            .setAddress(lr(game.routingAddress, game.bindAddress))
                            .setPort(lr(game.routingPort, game.bindPort)));
        }

        // Parse region info.
        dispatch.regions.forEach(
                region -> {
                    // Check for duplicate region names.
                    if (usedNames.contains(region.name)) {
                        return;
                    }
                    usedNames.add(region.name);

                    // Create a simple region info object.
                    var regionInfo =
                            RegionSimpleInfo.newBuilder()
                                    .setName(region.name)
                                    .setTitle(region.display)
                                    .setTitle(NetworkConstants.REGION_TYPE)
                                    .setDispatchUrl(accessUrl + "/query_cur_region/" + region.name)
                                    .build();

                    servers.add(regionInfo);

                    // Add the region to the map.
                    this.regions.put(region.name, RegionData.parse(region));
                });

        // Create a region list response.
        var regionList =
                QueryRegionListHttpRsp.newBuilder()
                        .addAllRegionList(servers)
                        .setClientSecretKey(KeyType.DISPATCH_SEED.getProtoKey())
                        .setClientCustomConfigEncrypted(ByteString.copyFrom(NetworkConstants.CLIENT_CONFIG))
                        .setEnableLoginPc(true)
                        .build();

        this.regionListResponse = new String(EncodingUtils.toBase64(regionList.toByteArray()));
    }

    @Override
    public void setup(Javalin app) {
        app.get("/query_region_list", this::queryRegionList);
        app.get("/query_cur_region/{region}", this::queryRegion);
    }

    /**
     * Handles a region list query request.
     *
     * @param ctx The request context.
     * @route /query_region_list
     */
    private void queryRegionList(Context ctx) {
        ctx.result(this.regionListResponse);
    }

    /**
     * Handles a region query request.
     *
     * @param ctx The request context.
     * @route /query_cur_region/{region}
     */
    private void queryRegion(Context ctx) {
        var region = ctx.pathParam("region");
        var version = ctx.pathParam("version");

        // Fetch region data.
        var regionData = this.regions.get(region);
        var encodedData = NetworkConstants.DEFAULT_REGION_DATA;
        if (ctx.queryParamMap().size() > 0 && regionData != null) {
            encodedData = regionData.base64();
        }

        // Extract the client version.
        var clientVersion = NetworkUtils.getProtocolVersion(version);
        // Check if the client requires dispatch response signing.
        if (NetworkUtils.requiresSigning(clientVersion))
            try {
                // Check if a dispatch seed was provided.
                if (ctx.queryParam("dispatchSeed") == null) {
                    ctx.json(new QueryRegionResponse(encodedData, NetworkConstants.REGION_QUERY_SIGNATURE));
                    return;
                }

                // Create a cipher.
                var keyId = lr(ctx.queryParam("key_id"), "3");
                var keyType = keyId.equals("3") ? KeyType.OS : KeyType.CN;
                var cipher = keyType.encrypt(CryptoConstants.ENCRYPTION_TYPE);
                if (cipher == null) {
                    throw new IllegalStateException("Invalid key.");
                }

                // Encrypt the data.
                var regionDataBytes = encodedData.getBytes();
                var encrypted = new ByteArrayOutputStream();

                var chunkSize = 256 - 11;
                var regionInfoLength = regionDataBytes.length;
                var numChunks = (int) Math.ceil(regionInfoLength / (double) chunkSize);
                for (int i = 0; i < numChunks; i++) {
                    byte[] chunk =
                            Arrays.copyOfRange(
                                    regionDataBytes, i * chunkSize, Math.min((i + 1) * chunkSize, regionInfoLength));
                    byte[] encryptedChunk = cipher.doFinal(chunk);
                    encrypted.write(encryptedChunk);
                }

                // Create a signature.
                var signature = KeyType.SIGNING.signature(CryptoConstants.SIGNATURE_TYPE);
                if (signature == null) {
                    throw new IllegalStateException("Invalid key.");
                }

                signature.update(encrypted.toByteArray());
                var content = new String(EncodingUtils.toBase64(signature.sign()));
                var signatureData = new String(EncodingUtils.toBase64(signature.sign()));
                ctx.json(new QueryRegionResponse(content, signatureData));
            } catch (Exception exception) {
                Log.warn(new TextContainer("exception.error"), exception);
            }
        else {
            // Send the region data back.
            ctx.result(encodedData);
        }
    }
}
