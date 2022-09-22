// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EnterChessDungeonRsp.proto

package io.grasscutter.proto;

public final class EnterChessDungeonRspOuterClass {
  private EnterChessDungeonRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface EnterChessDungeonRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:EnterChessDungeonRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 map_id = 13;</code>
     * @return The mapId.
     */
    int getMapId();
  }
  /**
   * <pre>
   * CmdId: 8592
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code EnterChessDungeonRsp}
   */
  public static final class EnterChessDungeonRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:EnterChessDungeonRsp)
      EnterChessDungeonRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use EnterChessDungeonRsp.newBuilder() to construct.
    private EnterChessDungeonRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private EnterChessDungeonRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new EnterChessDungeonRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private EnterChessDungeonRsp(
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
            case 64: {

              retcode_ = input.readInt32();
              break;
            }
            case 104: {

              mapId_ = input.readUInt32();
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
      return io.grasscutter.proto.EnterChessDungeonRspOuterClass.internal_static_EnterChessDungeonRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.EnterChessDungeonRspOuterClass.internal_static_EnterChessDungeonRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp.class, io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 8;
    private int retcode_;
    /**
     * <code>int32 retcode = 8;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int MAP_ID_FIELD_NUMBER = 13;
    private int mapId_;
    /**
     * <code>uint32 map_id = 13;</code>
     * @return The mapId.
     */
    @java.lang.Override
    public int getMapId() {
      return mapId_;
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
      if (retcode_ != 0) {
        output.writeInt32(8, retcode_);
      }
      if (mapId_ != 0) {
        output.writeUInt32(13, mapId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(8, retcode_);
      }
      if (mapId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, mapId_);
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
      if (!(obj instanceof io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp other = (io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getMapId()
          != other.getMapId()) return false;
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
      hash = (37 * hash) + MAP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMapId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp prototype) {
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
     * CmdId: 8592
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code EnterChessDungeonRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:EnterChessDungeonRsp)
        io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.EnterChessDungeonRspOuterClass.internal_static_EnterChessDungeonRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.EnterChessDungeonRspOuterClass.internal_static_EnterChessDungeonRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp.class, io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp.newBuilder()
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

        mapId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.EnterChessDungeonRspOuterClass.internal_static_EnterChessDungeonRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp build() {
        io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp buildPartial() {
        io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp result = new io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp(this);
        result.retcode_ = retcode_;
        result.mapId_ = mapId_;
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
        if (other instanceof io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp) {
          return mergeFrom((io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp other) {
        if (other == io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getMapId() != 0) {
          setMapId(other.getMapId());
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
        io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp) e.getUnfinishedMessage();
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
       * <code>int32 retcode = 8;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int mapId_ ;
      /**
       * <code>uint32 map_id = 13;</code>
       * @return The mapId.
       */
      @java.lang.Override
      public int getMapId() {
        return mapId_;
      }
      /**
       * <code>uint32 map_id = 13;</code>
       * @param value The mapId to set.
       * @return This builder for chaining.
       */
      public Builder setMapId(int value) {
        
        mapId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 map_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearMapId() {
        
        mapId_ = 0;
        onChanged();
        return this;
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


      // @@protoc_insertion_point(builder_scope:EnterChessDungeonRsp)
    }

    // @@protoc_insertion_point(class_scope:EnterChessDungeonRsp)
    private static final io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp();
    }

    public static io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<EnterChessDungeonRsp>
        PARSER = new com.google.protobuf.AbstractParser<EnterChessDungeonRsp>() {
      @java.lang.Override
      public EnterChessDungeonRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnterChessDungeonRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<EnterChessDungeonRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<EnterChessDungeonRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.EnterChessDungeonRspOuterClass.EnterChessDungeonRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnterChessDungeonRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnterChessDungeonRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032EnterChessDungeonRsp.proto\"7\n\024EnterChe" +
      "ssDungeonRsp\022\017\n\007retcode\030\010 \001(\005\022\016\n\006map_id\030" +
      "\r \001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_EnterChessDungeonRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnterChessDungeonRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnterChessDungeonRsp_descriptor,
        new java.lang.String[] { "Retcode", "MapId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}