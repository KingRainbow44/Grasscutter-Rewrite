// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetOnlinePlayerInfoRsp.proto

package io.grasscutter.proto;

public final class GetOnlinePlayerInfoRspOuterClass {
  private GetOnlinePlayerInfoRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetOnlinePlayerInfoRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetOnlinePlayerInfoRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 target_uid = 7;</code>
     * @return The targetUid.
     */
    int getTargetUid();

    /**
     * <code>uint32 param = 4;</code>
     * @return The param.
     */
    int getParam();

    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     * @return Whether the targetPlayerInfo field is set.
     */
    boolean hasTargetPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     * @return The targetPlayerInfo.
     */
    io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getTargetPlayerInfo();
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     */
    io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getTargetPlayerInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 47
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code GetOnlinePlayerInfoRsp}
   */
  public static final class GetOnlinePlayerInfoRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetOnlinePlayerInfoRsp)
      GetOnlinePlayerInfoRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetOnlinePlayerInfoRsp.newBuilder() to construct.
    private GetOnlinePlayerInfoRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetOnlinePlayerInfoRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetOnlinePlayerInfoRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetOnlinePlayerInfoRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {

              param_ = input.readUInt32();
              break;
            }
            case 56: {

              targetUid_ = input.readUInt32();
              break;
            }
            case 88: {

              retcode_ = input.readInt32();
              break;
            }
            case 114: {
              io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder subBuilder = null;
              if (targetPlayerInfo_ != null) {
                subBuilder = targetPlayerInfo_.toBuilder();
              }
              targetPlayerInfo_ = input.readMessage(io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(targetPlayerInfo_);
                targetPlayerInfo_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.class, io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int TARGET_UID_FIELD_NUMBER = 7;
    private int targetUid_;
    /**
     * <code>uint32 target_uid = 7;</code>
     * @return The targetUid.
     */
    @java.lang.Override
    public int getTargetUid() {
      return targetUid_;
    }

    public static final int PARAM_FIELD_NUMBER = 4;
    private int param_;
    /**
     * <code>uint32 param = 4;</code>
     * @return The param.
     */
    @java.lang.Override
    public int getParam() {
      return param_;
    }

    public static final int TARGET_PLAYER_INFO_FIELD_NUMBER = 14;
    private io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo targetPlayerInfo_;
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     * @return Whether the targetPlayerInfo field is set.
     */
    @java.lang.Override
    public boolean hasTargetPlayerInfo() {
      return targetPlayerInfo_ != null;
    }
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     * @return The targetPlayerInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getTargetPlayerInfo() {
      return targetPlayerInfo_ == null ? io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : targetPlayerInfo_;
    }
    /**
     * <code>.OnlinePlayerInfo target_player_info = 14;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getTargetPlayerInfoOrBuilder() {
      return getTargetPlayerInfo();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (param_ != 0) {
        output.writeUInt32(4, param_);
      }
      if (targetUid_ != 0) {
        output.writeUInt32(7, targetUid_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      if (targetPlayerInfo_ != null) {
        output.writeMessage(14, getTargetPlayerInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (param_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, param_);
      }
      if (targetUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, targetUid_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
      }
      if (targetPlayerInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(14, getTargetPlayerInfo());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp other = (io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getTargetUid()
          != other.getTargetUid()) return false;
      if (getParam()
          != other.getParam()) return false;
      if (hasTargetPlayerInfo() != other.hasTargetPlayerInfo()) return false;
      if (hasTargetPlayerInfo()) {
        if (!getTargetPlayerInfo()
            .equals(other.getTargetPlayerInfo())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + TARGET_UID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetUid();
      hash = (37 * hash) + PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getParam();
      if (hasTargetPlayerInfo()) {
        hash = (37 * hash) + TARGET_PLAYER_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getTargetPlayerInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * CmdId: 47
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code GetOnlinePlayerInfoRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetOnlinePlayerInfoRsp)
        io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.class, io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        retcode_ = 0;

        targetUid_ = 0;

        param_ = 0;

        if (targetPlayerInfoBuilder_ == null) {
          targetPlayerInfo_ = null;
        } else {
          targetPlayerInfo_ = null;
          targetPlayerInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.internal_static_GetOnlinePlayerInfoRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp build() {
        io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp buildPartial() {
        io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp result = new io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp(this);
        result.retcode_ = retcode_;
        result.targetUid_ = targetUid_;
        result.param_ = param_;
        if (targetPlayerInfoBuilder_ == null) {
          result.targetPlayerInfo_ = targetPlayerInfo_;
        } else {
          result.targetPlayerInfo_ = targetPlayerInfoBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp) {
          return mergeFrom((io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp other) {
        if (other == io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getTargetUid() != 0) {
          setTargetUid(other.getTargetUid());
        }
        if (other.getParam() != 0) {
          setParam(other.getParam());
        }
        if (other.hasTargetPlayerInfo()) {
          mergeTargetPlayerInfo(other.getTargetPlayerInfo());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int targetUid_ ;
      /**
       * <code>uint32 target_uid = 7;</code>
       * @return The targetUid.
       */
      @java.lang.Override
      public int getTargetUid() {
        return targetUid_;
      }
      /**
       * <code>uint32 target_uid = 7;</code>
       * @param value The targetUid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetUid(int value) {
        
        targetUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_uid = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetUid() {
        
        targetUid_ = 0;
        onChanged();
        return this;
      }

      private int param_ ;
      /**
       * <code>uint32 param = 4;</code>
       * @return The param.
       */
      @java.lang.Override
      public int getParam() {
        return param_;
      }
      /**
       * <code>uint32 param = 4;</code>
       * @param value The param to set.
       * @return This builder for chaining.
       */
      public Builder setParam(int value) {
        
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 param = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearParam() {
        
        param_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo targetPlayerInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> targetPlayerInfoBuilder_;
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       * @return Whether the targetPlayerInfo field is set.
       */
      public boolean hasTargetPlayerInfo() {
        return targetPlayerInfoBuilder_ != null || targetPlayerInfo_ != null;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       * @return The targetPlayerInfo.
       */
      public io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo getTargetPlayerInfo() {
        if (targetPlayerInfoBuilder_ == null) {
          return targetPlayerInfo_ == null ? io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : targetPlayerInfo_;
        } else {
          return targetPlayerInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public Builder setTargetPlayerInfo(io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (targetPlayerInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          targetPlayerInfo_ = value;
          onChanged();
        } else {
          targetPlayerInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public Builder setTargetPlayerInfo(
          io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder builderForValue) {
        if (targetPlayerInfoBuilder_ == null) {
          targetPlayerInfo_ = builderForValue.build();
          onChanged();
        } else {
          targetPlayerInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public Builder mergeTargetPlayerInfo(io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo value) {
        if (targetPlayerInfoBuilder_ == null) {
          if (targetPlayerInfo_ != null) {
            targetPlayerInfo_ =
              io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.newBuilder(targetPlayerInfo_).mergeFrom(value).buildPartial();
          } else {
            targetPlayerInfo_ = value;
          }
          onChanged();
        } else {
          targetPlayerInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public Builder clearTargetPlayerInfo() {
        if (targetPlayerInfoBuilder_ == null) {
          targetPlayerInfo_ = null;
          onChanged();
        } else {
          targetPlayerInfo_ = null;
          targetPlayerInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder getTargetPlayerInfoBuilder() {
        
        onChanged();
        return getTargetPlayerInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      public io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder getTargetPlayerInfoOrBuilder() {
        if (targetPlayerInfoBuilder_ != null) {
          return targetPlayerInfoBuilder_.getMessageOrBuilder();
        } else {
          return targetPlayerInfo_ == null ?
              io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.getDefaultInstance() : targetPlayerInfo_;
        }
      }
      /**
       * <code>.OnlinePlayerInfo target_player_info = 14;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder> 
          getTargetPlayerInfoFieldBuilder() {
        if (targetPlayerInfoBuilder_ == null) {
          targetPlayerInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo, io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfo.Builder, io.grasscutter.proto.OnlinePlayerInfoOuterClass.OnlinePlayerInfoOrBuilder>(
                  getTargetPlayerInfo(),
                  getParentForChildren(),
                  isClean());
          targetPlayerInfo_ = null;
        }
        return targetPlayerInfoBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GetOnlinePlayerInfoRsp)
    }

    // @@protoc_insertion_point(class_scope:GetOnlinePlayerInfoRsp)
    private static final io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp();
    }

    public static io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetOnlinePlayerInfoRsp>
        PARSER = new com.google.protobuf.AbstractParser<GetOnlinePlayerInfoRsp>() {
      @java.lang.Override
      public GetOnlinePlayerInfoRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetOnlinePlayerInfoRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetOnlinePlayerInfoRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetOnlinePlayerInfoRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.GetOnlinePlayerInfoRspOuterClass.GetOnlinePlayerInfoRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetOnlinePlayerInfoRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetOnlinePlayerInfoRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034GetOnlinePlayerInfoRsp.proto\032\026OnlinePl" +
      "ayerInfo.proto\"{\n\026GetOnlinePlayerInfoRsp" +
      "\022\017\n\007retcode\030\013 \001(\005\022\022\n\ntarget_uid\030\007 \001(\r\022\r\n" +
      "\005param\030\004 \001(\r\022-\n\022target_player_info\030\016 \001(\013" +
      "2\021.OnlinePlayerInfoB\026\n\024io.grasscutter.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.OnlinePlayerInfoOuterClass.getDescriptor(),
        });
    internal_static_GetOnlinePlayerInfoRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetOnlinePlayerInfoRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetOnlinePlayerInfoRsp_descriptor,
        new java.lang.String[] { "Retcode", "TargetUid", "Param", "TargetPlayerInfo", });
    io.grasscutter.proto.OnlinePlayerInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}