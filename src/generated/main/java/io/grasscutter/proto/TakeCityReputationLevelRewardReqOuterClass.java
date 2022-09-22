// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeCityReputationLevelRewardReq.proto

package io.grasscutter.proto;

public final class TakeCityReputationLevelRewardReqOuterClass {
  private TakeCityReputationLevelRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeCityReputationLevelRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeCityReputationLevelRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 level = 11;</code>
     * @return The level.
     */
    int getLevel();

    /**
     * <code>uint32 city_id = 1;</code>
     * @return The cityId.
     */
    int getCityId();
  }
  /**
   * <pre>
   * CmdId: 2812
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code TakeCityReputationLevelRewardReq}
   */
  public static final class TakeCityReputationLevelRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeCityReputationLevelRewardReq)
      TakeCityReputationLevelRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeCityReputationLevelRewardReq.newBuilder() to construct.
    private TakeCityReputationLevelRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeCityReputationLevelRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeCityReputationLevelRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeCityReputationLevelRewardReq(
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
            case 8: {

              cityId_ = input.readUInt32();
              break;
            }
            case 88: {

              level_ = input.readUInt32();
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
      return io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.internal_static_TakeCityReputationLevelRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.internal_static_TakeCityReputationLevelRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq.class, io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq.Builder.class);
    }

    public static final int LEVEL_FIELD_NUMBER = 11;
    private int level_;
    /**
     * <code>uint32 level = 11;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      return level_;
    }

    public static final int CITY_ID_FIELD_NUMBER = 1;
    private int cityId_;
    /**
     * <code>uint32 city_id = 1;</code>
     * @return The cityId.
     */
    @java.lang.Override
    public int getCityId() {
      return cityId_;
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
      if (cityId_ != 0) {
        output.writeUInt32(1, cityId_);
      }
      if (level_ != 0) {
        output.writeUInt32(11, level_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, cityId_);
      }
      if (level_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, level_);
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
      if (!(obj instanceof io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq other = (io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq) obj;

      if (getLevel()
          != other.getLevel()) return false;
      if (getCityId()
          != other.getCityId()) return false;
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
      hash = (37 * hash) + LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getLevel();
      hash = (37 * hash) + CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq prototype) {
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
     * CmdId: 2812
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code TakeCityReputationLevelRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeCityReputationLevelRewardReq)
        io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.internal_static_TakeCityReputationLevelRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.internal_static_TakeCityReputationLevelRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq.class, io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq.newBuilder()
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
        level_ = 0;

        cityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.internal_static_TakeCityReputationLevelRewardReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq getDefaultInstanceForType() {
        return io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq build() {
        io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq buildPartial() {
        io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq result = new io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq(this);
        result.level_ = level_;
        result.cityId_ = cityId_;
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
        if (other instanceof io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq) {
          return mergeFrom((io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq other) {
        if (other == io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq.getDefaultInstance()) return this;
        if (other.getLevel() != 0) {
          setLevel(other.getLevel());
        }
        if (other.getCityId() != 0) {
          setCityId(other.getCityId());
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
        io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int level_ ;
      /**
       * <code>uint32 level = 11;</code>
       * @return The level.
       */
      @java.lang.Override
      public int getLevel() {
        return level_;
      }
      /**
       * <code>uint32 level = 11;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        
        level_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        
        level_ = 0;
        onChanged();
        return this;
      }

      private int cityId_ ;
      /**
       * <code>uint32 city_id = 1;</code>
       * @return The cityId.
       */
      @java.lang.Override
      public int getCityId() {
        return cityId_;
      }
      /**
       * <code>uint32 city_id = 1;</code>
       * @param value The cityId to set.
       * @return This builder for chaining.
       */
      public Builder setCityId(int value) {
        
        cityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 city_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCityId() {
        
        cityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeCityReputationLevelRewardReq)
    }

    // @@protoc_insertion_point(class_scope:TakeCityReputationLevelRewardReq)
    private static final io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq();
    }

    public static io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeCityReputationLevelRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeCityReputationLevelRewardReq>() {
      @java.lang.Override
      public TakeCityReputationLevelRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeCityReputationLevelRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeCityReputationLevelRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeCityReputationLevelRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.TakeCityReputationLevelRewardReqOuterClass.TakeCityReputationLevelRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeCityReputationLevelRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeCityReputationLevelRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&TakeCityReputationLevelRewardReq.proto" +
      "\"B\n TakeCityReputationLevelRewardReq\022\r\n\005" +
      "level\030\013 \001(\r\022\017\n\007city_id\030\001 \001(\rB\026\n\024io.grass" +
      "cutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TakeCityReputationLevelRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeCityReputationLevelRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeCityReputationLevelRewardReq_descriptor,
        new java.lang.String[] { "Level", "CityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}