package io.grasscutter.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.protobuf.ByteString;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Base64;
import java.util.Map;

/* Utility methods seen when converting data. */
public interface EncodingUtils {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    /**
     * Encodes the given string into a Base64 string.
     *
     * @param string The string to encode.
     * @return The encoded string.
     */
    static String toBase64(String string) {
        return new String(EncodingUtils.toBase64(string.getBytes()));
    }

    /**
     * Encodes the given byte array into a Base64 buffer.
     *
     * @param bytes The bytes to encode.
     * @return The encoded string.
     */
    static byte[] toBase64(byte[] bytes) {
        return Base64.getEncoder().encode(bytes);
    }

    /**
     * Decodes the given Base64 string into a string.
     *
     * @param string The string to decode.
     * @return The decoded string.
     */
    static String fromBase64(String string) {
        return new String(EncodingUtils.fromBase64(string.getBytes()));
    }

    /**
     * Decodes the given Base64 buffer into a byte array.
     *
     * @param bytes The bytes to decode.
     * @return The decoded byte array.
     */
    static byte[] fromBase64(byte[] bytes) {
        return Base64.getDecoder().decode(bytes);
    }

    /**
     * Converts a Netty {@link ByteBuf} into a hex string.
     *
     * @param buffer The buffer to convert.
     * @return The hex string.
     */
    static String toHex(ByteBuf buffer) {
        return EncodingUtils.toHex(EncodingUtils.toByteArray(buffer));
    }

    /**
     * Converts a byte array into a hex string.
     *
     * @param buffer The bytes to convert.
     * @return The hex string.
     */
    static String toHex(byte[] buffer) {
        var builder = new StringBuilder();
        for (var b : buffer) {
            builder.append(String.format("%02x", b));
        }
        return builder.toString();
    }

    /**
     * Converts a Netty {@link ByteBuf} into a plain byte array.
     *
     * @param buffer The buffer to convert.
     * @return The converted buffer.
     */
    static byte[] toByteArray(ByteBuf buffer) {
        var bytes = new byte[buffer.readableBytes()];
        buffer.readBytes(bytes);
        return bytes;
    }

    /**
     * Converts a byte array into a Netty {@link ByteBuf}.
     *
     * @param bytes The bytes to convert.
     * @return The converted bytes.
     */
    static ByteBuf toBuffer(byte[] bytes) {
        var buffer = ByteBufAllocator.DEFAULT.buffer();
        buffer.writeBytes(bytes);
        return buffer;
    }

    /**
     * Serializes and encodes an object into a JSON string.
     *
     * @param object The object to serialize.
     * @return The serialized object.
     */
    static String toJson(Object object) {
        return gson.toJson(object);
    }

    /**
     * Decodes and deserializes a JSON string into an object.
     *
     * @param file The file to read the JSON from.
     * @param type The type of object to deserialize.
     * @return The deserialized object.
     * @throws IOException if the file could not be read.
     */
    static <T> T fromJson(File file, Type type) throws IOException {
        return gson.fromJson(new FileReader(file), type);
    }

    /**
     * De-serializes and decodes a JSON string into an object.
     *
     * @param data The data to deserialize.
     * @param type The type of object to deserialize into.
     * @return The deserialized object.
     */
    static <T> T fromJson(String data, Type type) {
        return gson.fromJson(data, type);
    }

    /**
     * Decodes and deserializes a JSON string into an object.
     *
     * @param file The file to read the JSON from.
     * @param type The type of object to deserialize.
     * @return The deserialized object.
     * @throws IOException if the file could not be read.
     */
    static <T> T fromJson(File file, Class<T> type) throws IOException {
        return gson.fromJson(new FileReader(file), type);
    }

    /**
     * De-serializes and decodes a JSON string into an object.
     *
     * @param data The data to deserialize.
     * @param type The type of object to deserialize into.
     * @return The deserialized object.
     */
    static <T> T fromJson(String data, Class<T> type) {
        return gson.fromJson(data, type);
    }

    /**
     * De-serializes entries from a map into an object.
     *
     * @param object The object to deserialize into.
     * @param serialized The serialized entries.
     */
    static void deserializeTo(Object object, Map<String, Object> serialized) {
        serialized.forEach(
                (key, value) -> {
                    try {
                        // Get field data.
                        var field = object.getClass().getDeclaredField(key);
                        var fieldType = field.getType();
                        // De-serialize the value.
                        var deserialized = gson.fromJson(gson.toJson(value), fieldType);

                        // Write data to the field.
                        field.setAccessible(true);
                        field.set(object, deserialized);
                    } catch (ReflectiveOperationException ignored) {
                    }
                });
    }

    /**
     * Converts milliseconds into seconds.
     *
     * @param millis The milliseconds to convert.
     * @return The converted milliseconds.
     */
    static String toSeconds(long millis) {
        return String.format("%.3f", millis / 1000.0);
    }

    /**
     * Converts a byte array into a byte string.
     *
     * @param bytes The bytes to convert.
     * @return The converted bytes.
     */
    static ByteString toByteString(byte[] bytes) {
        return ByteString.copyFrom(bytes);
    }
}
