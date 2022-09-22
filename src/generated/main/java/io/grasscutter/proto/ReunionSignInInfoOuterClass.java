// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReunionSignInInfo.proto

package io.grasscutter.proto;

public final class ReunionSignInInfoOuterClass {
  private ReunionSignInInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReunionSignInInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReunionSignInInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 sign_in_count = 6;</code>
     * @return The signInCount.
     */
    int getSignInCount();

    /**
     * <code>repeated uint32 reward_day_list = 8;</code>
     * @return A list containing the rewardDayList.
     */
    java.util.List<java.lang.Integer> getRewardDayListList();
    /**
     * <code>repeated uint32 reward_day_list = 8;</code>
     * @return The count of rewardDayList.
     */
    int getRewardDayListCount();
    /**
     * <code>repeated uint32 reward_day_list = 8;</code>
     * @param index The index of the element to return.
     * @return The rewardDayList at the given index.
     */
    int getRewardDayList(int index);

    /**
     * <code>uint32 config_id = 12;</code>
     * @return The configId.
     */
    int getConfigId();

    /**
     * <code>uint32 last_sign_in_time = 11;</code>
     * @return The lastSignInTime.
     */
    int getLastSignInTime();
  }
  /**
   * Protobuf type {@code ReunionSignInInfo}
   */
  public static final class ReunionSignInInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReunionSignInInfo)
      ReunionSignInInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReunionSignInInfo.newBuilder() to construct.
    private ReunionSignInInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReunionSignInInfo() {
      rewardDayList_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReunionSignInInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReunionSignInInfo(
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
            case 48: {

              signInCount_ = input.readUInt32();
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                rewardDayList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              rewardDayList_.addInt(input.readUInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                rewardDayList_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                rewardDayList_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 88: {

              lastSignInTime_ = input.readUInt32();
              break;
            }
            case 96: {

              configId_ = input.readUInt32();
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
          rewardDayList_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.ReunionSignInInfoOuterClass.internal_static_ReunionSignInInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ReunionSignInInfoOuterClass.internal_static_ReunionSignInInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.class, io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder.class);
    }

    public static final int SIGN_IN_COUNT_FIELD_NUMBER = 6;
    private int signInCount_;
    /**
     * <code>uint32 sign_in_count = 6;</code>
     * @return The signInCount.
     */
    @java.lang.Override
    public int getSignInCount() {
      return signInCount_;
    }

    public static final int REWARD_DAY_LIST_FIELD_NUMBER = 8;
    private com.google.protobuf.Internal.IntList rewardDayList_;
    /**
     * <code>repeated uint32 reward_day_list = 8;</code>
     * @return A list containing the rewardDayList.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getRewardDayListList() {
      return rewardDayList_;
    }
    /**
     * <code>repeated uint32 reward_day_list = 8;</code>
     * @return The count of rewardDayList.
     */
    public int getRewardDayListCount() {
      return rewardDayList_.size();
    }
    /**
     * <code>repeated uint32 reward_day_list = 8;</code>
     * @param index The index of the element to return.
     * @return The rewardDayList at the given index.
     */
    public int getRewardDayList(int index) {
      return rewardDayList_.getInt(index);
    }
    private int rewardDayListMemoizedSerializedSize = -1;

    public static final int CONFIG_ID_FIELD_NUMBER = 12;
    private int configId_;
    /**
     * <code>uint32 config_id = 12;</code>
     * @return The configId.
     */
    @java.lang.Override
    public int getConfigId() {
      return configId_;
    }

    public static final int LAST_SIGN_IN_TIME_FIELD_NUMBER = 11;
    private int lastSignInTime_;
    /**
     * <code>uint32 last_sign_in_time = 11;</code>
     * @return The lastSignInTime.
     */
    @java.lang.Override
    public int getLastSignInTime() {
      return lastSignInTime_;
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
      getSerializedSize();
      if (signInCount_ != 0) {
        output.writeUInt32(6, signInCount_);
      }
      if (getRewardDayListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(rewardDayListMemoizedSerializedSize);
      }
      for (int i = 0; i < rewardDayList_.size(); i++) {
        output.writeUInt32NoTag(rewardDayList_.getInt(i));
      }
      if (lastSignInTime_ != 0) {
        output.writeUInt32(11, lastSignInTime_);
      }
      if (configId_ != 0) {
        output.writeUInt32(12, configId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (signInCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, signInCount_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < rewardDayList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(rewardDayList_.getInt(i));
        }
        size += dataSize;
        if (!getRewardDayListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        rewardDayListMemoizedSerializedSize = dataSize;
      }
      if (lastSignInTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, lastSignInTime_);
      }
      if (configId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, configId_);
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
      if (!(obj instanceof io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo other = (io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo) obj;

      if (getSignInCount()
          != other.getSignInCount()) return false;
      if (!getRewardDayListList()
          .equals(other.getRewardDayListList())) return false;
      if (getConfigId()
          != other.getConfigId()) return false;
      if (getLastSignInTime()
          != other.getLastSignInTime()) return false;
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
      hash = (37 * hash) + SIGN_IN_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getSignInCount();
      if (getRewardDayListCount() > 0) {
        hash = (37 * hash) + REWARD_DAY_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getRewardDayListList().hashCode();
      }
      hash = (37 * hash) + CONFIG_ID_FIELD_NUMBER;
      hash = (53 * hash) + getConfigId();
      hash = (37 * hash) + LAST_SIGN_IN_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getLastSignInTime();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo prototype) {
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
     * Protobuf type {@code ReunionSignInInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReunionSignInInfo)
        io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ReunionSignInInfoOuterClass.internal_static_ReunionSignInInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ReunionSignInInfoOuterClass.internal_static_ReunionSignInInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.class, io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.newBuilder()
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
        signInCount_ = 0;

        rewardDayList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        configId_ = 0;

        lastSignInTime_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ReunionSignInInfoOuterClass.internal_static_ReunionSignInInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo build() {
        io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo buildPartial() {
        io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo result = new io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo(this);
        int from_bitField0_ = bitField0_;
        result.signInCount_ = signInCount_;
        if (((bitField0_ & 0x00000001) != 0)) {
          rewardDayList_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.rewardDayList_ = rewardDayList_;
        result.configId_ = configId_;
        result.lastSignInTime_ = lastSignInTime_;
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
        if (other instanceof io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo) {
          return mergeFrom((io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo other) {
        if (other == io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo.getDefaultInstance()) return this;
        if (other.getSignInCount() != 0) {
          setSignInCount(other.getSignInCount());
        }
        if (!other.rewardDayList_.isEmpty()) {
          if (rewardDayList_.isEmpty()) {
            rewardDayList_ = other.rewardDayList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRewardDayListIsMutable();
            rewardDayList_.addAll(other.rewardDayList_);
          }
          onChanged();
        }
        if (other.getConfigId() != 0) {
          setConfigId(other.getConfigId());
        }
        if (other.getLastSignInTime() != 0) {
          setLastSignInTime(other.getLastSignInTime());
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
        io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int signInCount_ ;
      /**
       * <code>uint32 sign_in_count = 6;</code>
       * @return The signInCount.
       */
      @java.lang.Override
      public int getSignInCount() {
        return signInCount_;
      }
      /**
       * <code>uint32 sign_in_count = 6;</code>
       * @param value The signInCount to set.
       * @return This builder for chaining.
       */
      public Builder setSignInCount(int value) {
        
        signInCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 sign_in_count = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearSignInCount() {
        
        signInCount_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList rewardDayList_ = emptyIntList();
      private void ensureRewardDayListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          rewardDayList_ = mutableCopy(rewardDayList_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 reward_day_list = 8;</code>
       * @return A list containing the rewardDayList.
       */
      public java.util.List<java.lang.Integer>
          getRewardDayListList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(rewardDayList_) : rewardDayList_;
      }
      /**
       * <code>repeated uint32 reward_day_list = 8;</code>
       * @return The count of rewardDayList.
       */
      public int getRewardDayListCount() {
        return rewardDayList_.size();
      }
      /**
       * <code>repeated uint32 reward_day_list = 8;</code>
       * @param index The index of the element to return.
       * @return The rewardDayList at the given index.
       */
      public int getRewardDayList(int index) {
        return rewardDayList_.getInt(index);
      }
      /**
       * <code>repeated uint32 reward_day_list = 8;</code>
       * @param index The index to set the value at.
       * @param value The rewardDayList to set.
       * @return This builder for chaining.
       */
      public Builder setRewardDayList(
          int index, int value) {
        ensureRewardDayListIsMutable();
        rewardDayList_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reward_day_list = 8;</code>
       * @param value The rewardDayList to add.
       * @return This builder for chaining.
       */
      public Builder addRewardDayList(int value) {
        ensureRewardDayListIsMutable();
        rewardDayList_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reward_day_list = 8;</code>
       * @param values The rewardDayList to add.
       * @return This builder for chaining.
       */
      public Builder addAllRewardDayList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureRewardDayListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, rewardDayList_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 reward_day_list = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearRewardDayList() {
        rewardDayList_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private int configId_ ;
      /**
       * <code>uint32 config_id = 12;</code>
       * @return The configId.
       */
      @java.lang.Override
      public int getConfigId() {
        return configId_;
      }
      /**
       * <code>uint32 config_id = 12;</code>
       * @param value The configId to set.
       * @return This builder for chaining.
       */
      public Builder setConfigId(int value) {
        
        configId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 config_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearConfigId() {
        
        configId_ = 0;
        onChanged();
        return this;
      }

      private int lastSignInTime_ ;
      /**
       * <code>uint32 last_sign_in_time = 11;</code>
       * @return The lastSignInTime.
       */
      @java.lang.Override
      public int getLastSignInTime() {
        return lastSignInTime_;
      }
      /**
       * <code>uint32 last_sign_in_time = 11;</code>
       * @param value The lastSignInTime to set.
       * @return This builder for chaining.
       */
      public Builder setLastSignInTime(int value) {
        
        lastSignInTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 last_sign_in_time = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastSignInTime() {
        
        lastSignInTime_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ReunionSignInInfo)
    }

    // @@protoc_insertion_point(class_scope:ReunionSignInInfo)
    private static final io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo();
    }

    public static io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReunionSignInInfo>
        PARSER = new com.google.protobuf.AbstractParser<ReunionSignInInfo>() {
      @java.lang.Override
      public ReunionSignInInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReunionSignInInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReunionSignInInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReunionSignInInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ReunionSignInInfoOuterClass.ReunionSignInInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReunionSignInInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReunionSignInInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ReunionSignInInfo.proto\"q\n\021ReunionSign" +
      "InInfo\022\025\n\rsign_in_count\030\006 \001(\r\022\027\n\017reward_" +
      "day_list\030\010 \003(\r\022\021\n\tconfig_id\030\014 \001(\r\022\031\n\021las" +
      "t_sign_in_time\030\013 \001(\rB\026\n\024io.grasscutter.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ReunionSignInInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReunionSignInInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReunionSignInInfo_descriptor,
        new java.lang.String[] { "SignInCount", "RewardDayList", "ConfigId", "LastSignInTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}