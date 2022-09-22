// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DailyTaskUnlockedCitiesNotify.proto

package io.grasscutter.proto;

public final class DailyTaskUnlockedCitiesNotifyOuterClass {
  private DailyTaskUnlockedCitiesNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DailyTaskUnlockedCitiesNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DailyTaskUnlockedCitiesNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 unlocked_city_list = 12;</code>
     * @return A list containing the unlockedCityList.
     */
    java.util.List<java.lang.Integer> getUnlockedCityListList();
    /**
     * <code>repeated uint32 unlocked_city_list = 12;</code>
     * @return The count of unlockedCityList.
     */
    int getUnlockedCityListCount();
    /**
     * <code>repeated uint32 unlocked_city_list = 12;</code>
     * @param index The index of the element to return.
     * @return The unlockedCityList at the given index.
     */
    int getUnlockedCityList(int index);
  }
  /**
   * <pre>
   * CmdId: 186
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DailyTaskUnlockedCitiesNotify}
   */
  public static final class DailyTaskUnlockedCitiesNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DailyTaskUnlockedCitiesNotify)
      DailyTaskUnlockedCitiesNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DailyTaskUnlockedCitiesNotify.newBuilder() to construct.
    private DailyTaskUnlockedCitiesNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DailyTaskUnlockedCitiesNotify() {
      unlockedCityList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DailyTaskUnlockedCitiesNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DailyTaskUnlockedCitiesNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 96: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unlockedCityList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              unlockedCityList_.addInt(input.readUInt32());
              break;
            }
            case 98: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                unlockedCityList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                unlockedCityList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          unlockedCityList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.class, io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.Builder.class);
    }

    public static final int UNLOCKED_CITY_LIST_FIELD_NUMBER = 12;
    private com.google.protobuf.Internal.IntList unlockedCityList_;
    /**
     * <code>repeated uint32 unlocked_city_list = 12;</code>
     * @return A list containing the unlockedCityList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getUnlockedCityListList() {
      return unlockedCityList_;
    }
    /**
     * <code>repeated uint32 unlocked_city_list = 12;</code>
     * @return The count of unlockedCityList.
     */
    public int getUnlockedCityListCount() {
      return unlockedCityList_.size();
    }
    /**
     * <code>repeated uint32 unlocked_city_list = 12;</code>
     * @param index The index of the element to return.
     * @return The unlockedCityList at the given index.
     */
    public int getUnlockedCityList(int index) {
      return unlockedCityList_.getInt(index);
    }
    private int unlockedCityListMemoizedSerializedSize = -1;

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
      getSerializedSize();
      if (getUnlockedCityListList().size() > 0) {
        output.writeUInt32NoTag(98);
        output.writeUInt32NoTag(unlockedCityListMemoizedSerializedSize);
      }
      for (int i = 0; i < unlockedCityList_.size(); i++) {
        output.writeUInt32NoTag(unlockedCityList_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < unlockedCityList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(unlockedCityList_.getInt(i));
        }
        size += dataSize;
        if (!getUnlockedCityListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        unlockedCityListMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify other = (io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify) obj;

      if (!getUnlockedCityListList()
          .equals(other.getUnlockedCityListList())) return false;
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
      if (getUnlockedCityListCount() > 0) {
        hash = (37 * hash) + UNLOCKED_CITY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getUnlockedCityListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify prototype) {
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
     * CmdId: 186
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DailyTaskUnlockedCitiesNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DailyTaskUnlockedCitiesNotify)
        io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.class, io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.newBuilder()
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
        unlockedCityList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.internal_static_DailyTaskUnlockedCitiesNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify build() {
        io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify buildPartial() {
        io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify result = new io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          unlockedCityList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.unlockedCityList_ = unlockedCityList_;
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
        if (other instanceof io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify) {
          return mergeFrom((io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify other) {
        if (other == io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify.getDefaultInstance()) return this;
        if (!other.unlockedCityList_.isEmpty()) {
          if (unlockedCityList_.isEmpty()) {
            unlockedCityList_ = other.unlockedCityList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUnlockedCityListIsMutable();
            unlockedCityList_.addAll(other.unlockedCityList_);
          }
          onChanged();
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
        io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList unlockedCityList_ = emptyIntList();
      private void ensureUnlockedCityListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unlockedCityList_ = mutableCopy(unlockedCityList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 unlocked_city_list = 12;</code>
       * @return A list containing the unlockedCityList.
       */
      public java.util.List<java.lang.Integer>
          getUnlockedCityListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(unlockedCityList_) : unlockedCityList_;
      }
      /**
       * <code>repeated uint32 unlocked_city_list = 12;</code>
       * @return The count of unlockedCityList.
       */
      public int getUnlockedCityListCount() {
        return unlockedCityList_.size();
      }
      /**
       * <code>repeated uint32 unlocked_city_list = 12;</code>
       * @param index The index of the element to return.
       * @return The unlockedCityList at the given index.
       */
      public int getUnlockedCityList(int index) {
        return unlockedCityList_.getInt(index);
      }
      /**
       * <code>repeated uint32 unlocked_city_list = 12;</code>
       * @param index The index to set the value at.
       * @param value The unlockedCityList to set.
       * @return This builder for chaining.
       */
      public Builder setUnlockedCityList(
          int index, int value) {
        ensureUnlockedCityListIsMutable();
        unlockedCityList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlocked_city_list = 12;</code>
       * @param value The unlockedCityList to add.
       * @return This builder for chaining.
       */
      public Builder addUnlockedCityList(int value) {
        ensureUnlockedCityListIsMutable();
        unlockedCityList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlocked_city_list = 12;</code>
       * @param values The unlockedCityList to add.
       * @return This builder for chaining.
       */
      public Builder addAllUnlockedCityList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureUnlockedCityListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, unlockedCityList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 unlocked_city_list = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnlockedCityList() {
        unlockedCityList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
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


      // @@protoc_insertion_point(builder_scope:DailyTaskUnlockedCitiesNotify)
    }

    // @@protoc_insertion_point(class_scope:DailyTaskUnlockedCitiesNotify)
    private static final io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify();
    }

    public static io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DailyTaskUnlockedCitiesNotify>
        PARSER = new com.google.protobuf.AbstractParser<DailyTaskUnlockedCitiesNotify>() {
      @java.lang.Override
      public DailyTaskUnlockedCitiesNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DailyTaskUnlockedCitiesNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DailyTaskUnlockedCitiesNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DailyTaskUnlockedCitiesNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.DailyTaskUnlockedCitiesNotifyOuterClass.DailyTaskUnlockedCitiesNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DailyTaskUnlockedCitiesNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DailyTaskUnlockedCitiesNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#DailyTaskUnlockedCitiesNotify.proto\";\n" +
      "\035DailyTaskUnlockedCitiesNotify\022\032\n\022unlock" +
      "ed_city_list\030\014 \003(\rB\026\n\024io.grasscutter.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DailyTaskUnlockedCitiesNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DailyTaskUnlockedCitiesNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DailyTaskUnlockedCitiesNotify_descriptor,
        new java.lang.String[] { "UnlockedCityList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}