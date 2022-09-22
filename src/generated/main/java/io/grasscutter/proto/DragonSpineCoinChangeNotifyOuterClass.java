// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DragonSpineCoinChangeNotify.proto

package io.grasscutter.proto;

public final class DragonSpineCoinChangeNotifyOuterClass {
  private DragonSpineCoinChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DragonSpineCoinChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DragonSpineCoinChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 shimmering_essence = 4;</code>
     * @return The shimmeringEssence.
     */
    int getShimmeringEssence();

    /**
     * <code>uint32 warm_essence = 13;</code>
     * @return The warmEssence.
     */
    int getWarmEssence();

    /**
     * <code>uint32 schedule_id = 12;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>uint32 wondrous_essence = 11;</code>
     * @return The wondrousEssence.
     */
    int getWondrousEssence();
  }
  /**
   * <pre>
   * CmdId: 2088
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DragonSpineCoinChangeNotify}
   */
  public static final class DragonSpineCoinChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DragonSpineCoinChangeNotify)
      DragonSpineCoinChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DragonSpineCoinChangeNotify.newBuilder() to construct.
    private DragonSpineCoinChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DragonSpineCoinChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DragonSpineCoinChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DragonSpineCoinChangeNotify(
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

              shimmeringEssence_ = input.readUInt32();
              break;
            }
            case 88: {

              wondrousEssence_ = input.readUInt32();
              break;
            }
            case 96: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 104: {

              warmEssence_ = input.readUInt32();
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
      return io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.internal_static_DragonSpineCoinChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.internal_static_DragonSpineCoinChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify.class, io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify.Builder.class);
    }

    public static final int SHIMMERING_ESSENCE_FIELD_NUMBER = 4;
    private int shimmeringEssence_;
    /**
     * <code>uint32 shimmering_essence = 4;</code>
     * @return The shimmeringEssence.
     */
    @java.lang.Override
    public int getShimmeringEssence() {
      return shimmeringEssence_;
    }

    public static final int WARM_ESSENCE_FIELD_NUMBER = 13;
    private int warmEssence_;
    /**
     * <code>uint32 warm_essence = 13;</code>
     * @return The warmEssence.
     */
    @java.lang.Override
    public int getWarmEssence() {
      return warmEssence_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 12;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 12;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int WONDROUS_ESSENCE_FIELD_NUMBER = 11;
    private int wondrousEssence_;
    /**
     * <code>uint32 wondrous_essence = 11;</code>
     * @return The wondrousEssence.
     */
    @java.lang.Override
    public int getWondrousEssence() {
      return wondrousEssence_;
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
      if (shimmeringEssence_ != 0) {
        output.writeUInt32(4, shimmeringEssence_);
      }
      if (wondrousEssence_ != 0) {
        output.writeUInt32(11, wondrousEssence_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(12, scheduleId_);
      }
      if (warmEssence_ != 0) {
        output.writeUInt32(13, warmEssence_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (shimmeringEssence_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, shimmeringEssence_);
      }
      if (wondrousEssence_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, wondrousEssence_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, scheduleId_);
      }
      if (warmEssence_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, warmEssence_);
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
      if (!(obj instanceof io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify other = (io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify) obj;

      if (getShimmeringEssence()
          != other.getShimmeringEssence()) return false;
      if (getWarmEssence()
          != other.getWarmEssence()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getWondrousEssence()
          != other.getWondrousEssence()) return false;
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
      hash = (37 * hash) + SHIMMERING_ESSENCE_FIELD_NUMBER;
      hash = (53 * hash) + getShimmeringEssence();
      hash = (37 * hash) + WARM_ESSENCE_FIELD_NUMBER;
      hash = (53 * hash) + getWarmEssence();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + WONDROUS_ESSENCE_FIELD_NUMBER;
      hash = (53 * hash) + getWondrousEssence();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify prototype) {
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
     * CmdId: 2088
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DragonSpineCoinChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DragonSpineCoinChangeNotify)
        io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.internal_static_DragonSpineCoinChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.internal_static_DragonSpineCoinChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify.class, io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify.newBuilder()
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
        shimmeringEssence_ = 0;

        warmEssence_ = 0;

        scheduleId_ = 0;

        wondrousEssence_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.internal_static_DragonSpineCoinChangeNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify build() {
        io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify buildPartial() {
        io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify result = new io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify(this);
        result.shimmeringEssence_ = shimmeringEssence_;
        result.warmEssence_ = warmEssence_;
        result.scheduleId_ = scheduleId_;
        result.wondrousEssence_ = wondrousEssence_;
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
        if (other instanceof io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify) {
          return mergeFrom((io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify other) {
        if (other == io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify.getDefaultInstance()) return this;
        if (other.getShimmeringEssence() != 0) {
          setShimmeringEssence(other.getShimmeringEssence());
        }
        if (other.getWarmEssence() != 0) {
          setWarmEssence(other.getWarmEssence());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getWondrousEssence() != 0) {
          setWondrousEssence(other.getWondrousEssence());
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
        io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int shimmeringEssence_ ;
      /**
       * <code>uint32 shimmering_essence = 4;</code>
       * @return The shimmeringEssence.
       */
      @java.lang.Override
      public int getShimmeringEssence() {
        return shimmeringEssence_;
      }
      /**
       * <code>uint32 shimmering_essence = 4;</code>
       * @param value The shimmeringEssence to set.
       * @return This builder for chaining.
       */
      public Builder setShimmeringEssence(int value) {
        
        shimmeringEssence_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 shimmering_essence = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearShimmeringEssence() {
        
        shimmeringEssence_ = 0;
        onChanged();
        return this;
      }

      private int warmEssence_ ;
      /**
       * <code>uint32 warm_essence = 13;</code>
       * @return The warmEssence.
       */
      @java.lang.Override
      public int getWarmEssence() {
        return warmEssence_;
      }
      /**
       * <code>uint32 warm_essence = 13;</code>
       * @param value The warmEssence to set.
       * @return This builder for chaining.
       */
      public Builder setWarmEssence(int value) {
        
        warmEssence_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 warm_essence = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearWarmEssence() {
        
        warmEssence_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int wondrousEssence_ ;
      /**
       * <code>uint32 wondrous_essence = 11;</code>
       * @return The wondrousEssence.
       */
      @java.lang.Override
      public int getWondrousEssence() {
        return wondrousEssence_;
      }
      /**
       * <code>uint32 wondrous_essence = 11;</code>
       * @param value The wondrousEssence to set.
       * @return This builder for chaining.
       */
      public Builder setWondrousEssence(int value) {
        
        wondrousEssence_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 wondrous_essence = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearWondrousEssence() {
        
        wondrousEssence_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DragonSpineCoinChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:DragonSpineCoinChangeNotify)
    private static final io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify();
    }

    public static io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DragonSpineCoinChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<DragonSpineCoinChangeNotify>() {
      @java.lang.Override
      public DragonSpineCoinChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DragonSpineCoinChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DragonSpineCoinChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DragonSpineCoinChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.DragonSpineCoinChangeNotifyOuterClass.DragonSpineCoinChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DragonSpineCoinChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DragonSpineCoinChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!DragonSpineCoinChangeNotify.proto\"~\n\033D" +
      "ragonSpineCoinChangeNotify\022\032\n\022shimmering" +
      "_essence\030\004 \001(\r\022\024\n\014warm_essence\030\r \001(\r\022\023\n\013" +
      "schedule_id\030\014 \001(\r\022\030\n\020wondrous_essence\030\013 " +
      "\001(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DragonSpineCoinChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DragonSpineCoinChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DragonSpineCoinChangeNotify_descriptor,
        new java.lang.String[] { "ShimmeringEssence", "WarmEssence", "ScheduleId", "WondrousEssence", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}