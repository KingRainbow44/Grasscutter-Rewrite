// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FinishDeliveryNotify.proto

package io.grasscutter.proto;

public final class FinishDeliveryNotifyOuterClass {
  private FinishDeliveryNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FinishDeliveryNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FinishDeliveryNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 finished_quest_index = 1;</code>
     * @return The finishedQuestIndex.
     */
    int getFinishedQuestIndex();

    /**
     * <code>uint32 schedule_id = 10;</code>
     * @return The scheduleId.
     */
    int getScheduleId();

    /**
     * <code>uint32 day_index = 12;</code>
     * @return The dayIndex.
     */
    int getDayIndex();
  }
  /**
   * <pre>
   * CmdId: 2089
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code FinishDeliveryNotify}
   */
  public static final class FinishDeliveryNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FinishDeliveryNotify)
      FinishDeliveryNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FinishDeliveryNotify.newBuilder() to construct.
    private FinishDeliveryNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FinishDeliveryNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FinishDeliveryNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FinishDeliveryNotify(
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

              finishedQuestIndex_ = input.readUInt32();
              break;
            }
            case 80: {

              scheduleId_ = input.readUInt32();
              break;
            }
            case 96: {

              dayIndex_ = input.readUInt32();
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
      return io.grasscutter.proto.FinishDeliveryNotifyOuterClass.internal_static_FinishDeliveryNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.FinishDeliveryNotifyOuterClass.internal_static_FinishDeliveryNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify.class, io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify.Builder.class);
    }

    public static final int FINISHED_QUEST_INDEX_FIELD_NUMBER = 1;
    private int finishedQuestIndex_;
    /**
     * <code>uint32 finished_quest_index = 1;</code>
     * @return The finishedQuestIndex.
     */
    @java.lang.Override
    public int getFinishedQuestIndex() {
      return finishedQuestIndex_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 10;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 10;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
    }

    public static final int DAY_INDEX_FIELD_NUMBER = 12;
    private int dayIndex_;
    /**
     * <code>uint32 day_index = 12;</code>
     * @return The dayIndex.
     */
    @java.lang.Override
    public int getDayIndex() {
      return dayIndex_;
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
      if (finishedQuestIndex_ != 0) {
        output.writeUInt32(1, finishedQuestIndex_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(10, scheduleId_);
      }
      if (dayIndex_ != 0) {
        output.writeUInt32(12, dayIndex_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (finishedQuestIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, finishedQuestIndex_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, scheduleId_);
      }
      if (dayIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dayIndex_);
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
      if (!(obj instanceof io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify other = (io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify) obj;

      if (getFinishedQuestIndex()
          != other.getFinishedQuestIndex()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
      if (getDayIndex()
          != other.getDayIndex()) return false;
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
      hash = (37 * hash) + FINISHED_QUEST_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getFinishedQuestIndex();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (37 * hash) + DAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getDayIndex();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify prototype) {
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
     * CmdId: 2089
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code FinishDeliveryNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FinishDeliveryNotify)
        io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.FinishDeliveryNotifyOuterClass.internal_static_FinishDeliveryNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.FinishDeliveryNotifyOuterClass.internal_static_FinishDeliveryNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify.class, io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify.newBuilder()
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
        finishedQuestIndex_ = 0;

        scheduleId_ = 0;

        dayIndex_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.FinishDeliveryNotifyOuterClass.internal_static_FinishDeliveryNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify build() {
        io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify buildPartial() {
        io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify result = new io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify(this);
        result.finishedQuestIndex_ = finishedQuestIndex_;
        result.scheduleId_ = scheduleId_;
        result.dayIndex_ = dayIndex_;
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
        if (other instanceof io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify) {
          return mergeFrom((io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify other) {
        if (other == io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify.getDefaultInstance()) return this;
        if (other.getFinishedQuestIndex() != 0) {
          setFinishedQuestIndex(other.getFinishedQuestIndex());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
        }
        if (other.getDayIndex() != 0) {
          setDayIndex(other.getDayIndex());
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
        io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int finishedQuestIndex_ ;
      /**
       * <code>uint32 finished_quest_index = 1;</code>
       * @return The finishedQuestIndex.
       */
      @java.lang.Override
      public int getFinishedQuestIndex() {
        return finishedQuestIndex_;
      }
      /**
       * <code>uint32 finished_quest_index = 1;</code>
       * @param value The finishedQuestIndex to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedQuestIndex(int value) {
        
        finishedQuestIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 finished_quest_index = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedQuestIndex() {
        
        finishedQuestIndex_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
        onChanged();
        return this;
      }

      private int dayIndex_ ;
      /**
       * <code>uint32 day_index = 12;</code>
       * @return The dayIndex.
       */
      @java.lang.Override
      public int getDayIndex() {
        return dayIndex_;
      }
      /**
       * <code>uint32 day_index = 12;</code>
       * @param value The dayIndex to set.
       * @return This builder for chaining.
       */
      public Builder setDayIndex(int value) {
        
        dayIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 day_index = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDayIndex() {
        
        dayIndex_ = 0;
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


      // @@protoc_insertion_point(builder_scope:FinishDeliveryNotify)
    }

    // @@protoc_insertion_point(class_scope:FinishDeliveryNotify)
    private static final io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify();
    }

    public static io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FinishDeliveryNotify>
        PARSER = new com.google.protobuf.AbstractParser<FinishDeliveryNotify>() {
      @java.lang.Override
      public FinishDeliveryNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FinishDeliveryNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FinishDeliveryNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FinishDeliveryNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.FinishDeliveryNotifyOuterClass.FinishDeliveryNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FinishDeliveryNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FinishDeliveryNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032FinishDeliveryNotify.proto\"\\\n\024FinishDe" +
      "liveryNotify\022\034\n\024finished_quest_index\030\001 \001" +
      "(\r\022\023\n\013schedule_id\030\n \001(\r\022\021\n\tday_index\030\014 \001" +
      "(\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FinishDeliveryNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FinishDeliveryNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FinishDeliveryNotify_descriptor,
        new java.lang.String[] { "FinishedQuestIndex", "ScheduleId", "DayIndex", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}