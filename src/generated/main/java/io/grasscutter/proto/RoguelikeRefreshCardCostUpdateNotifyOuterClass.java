// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RoguelikeRefreshCardCostUpdateNotify.proto

package io.grasscutter.proto;

public final class RoguelikeRefreshCardCostUpdateNotifyOuterClass {
  private RoguelikeRefreshCardCostUpdateNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoguelikeRefreshCardCostUpdateNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoguelikeRefreshCardCostUpdateNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 item_count = 5;</code>
     * @return The itemCount.
     */
    int getItemCount();

    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    int getItemId();
  }
  /**
   * <pre>
   * CmdId: 8927
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code RoguelikeRefreshCardCostUpdateNotify}
   */
  public static final class RoguelikeRefreshCardCostUpdateNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoguelikeRefreshCardCostUpdateNotify)
      RoguelikeRefreshCardCostUpdateNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoguelikeRefreshCardCostUpdateNotify.newBuilder() to construct.
    private RoguelikeRefreshCardCostUpdateNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoguelikeRefreshCardCostUpdateNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoguelikeRefreshCardCostUpdateNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoguelikeRefreshCardCostUpdateNotify(
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

              itemId_ = input.readUInt32();
              break;
            }
            case 40: {

              itemCount_ = input.readUInt32();
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
      return io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.internal_static_RoguelikeRefreshCardCostUpdateNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.internal_static_RoguelikeRefreshCardCostUpdateNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify.class, io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify.Builder.class);
    }

    public static final int ITEM_COUNT_FIELD_NUMBER = 5;
    private int itemCount_;
    /**
     * <code>uint32 item_count = 5;</code>
     * @return The itemCount.
     */
    @java.lang.Override
    public int getItemCount() {
      return itemCount_;
    }

    public static final int ITEM_ID_FIELD_NUMBER = 1;
    private int itemId_;
    /**
     * <code>uint32 item_id = 1;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
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
      if (itemId_ != 0) {
        output.writeUInt32(1, itemId_);
      }
      if (itemCount_ != 0) {
        output.writeUInt32(5, itemCount_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, itemId_);
      }
      if (itemCount_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, itemCount_);
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
      if (!(obj instanceof io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify other = (io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify) obj;

      if (getItemCount()
          != other.getItemCount()) return false;
      if (getItemId()
          != other.getItemId()) return false;
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
      hash = (37 * hash) + ITEM_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getItemCount();
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify prototype) {
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
     * CmdId: 8927
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code RoguelikeRefreshCardCostUpdateNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoguelikeRefreshCardCostUpdateNotify)
        io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.internal_static_RoguelikeRefreshCardCostUpdateNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.internal_static_RoguelikeRefreshCardCostUpdateNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify.class, io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify.newBuilder()
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
        itemCount_ = 0;

        itemId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.internal_static_RoguelikeRefreshCardCostUpdateNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify build() {
        io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify buildPartial() {
        io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify result = new io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify(this);
        result.itemCount_ = itemCount_;
        result.itemId_ = itemId_;
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
        if (other instanceof io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify) {
          return mergeFrom((io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify other) {
        if (other == io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify.getDefaultInstance()) return this;
        if (other.getItemCount() != 0) {
          setItemCount(other.getItemCount());
        }
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
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
        io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int itemCount_ ;
      /**
       * <code>uint32 item_count = 5;</code>
       * @return The itemCount.
       */
      @java.lang.Override
      public int getItemCount() {
        return itemCount_;
      }
      /**
       * <code>uint32 item_count = 5;</code>
       * @param value The itemCount to set.
       * @return This builder for chaining.
       */
      public Builder setItemCount(int value) {
        
        itemCount_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_count = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemCount() {
        
        itemCount_ = 0;
        onChanged();
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 1;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RoguelikeRefreshCardCostUpdateNotify)
    }

    // @@protoc_insertion_point(class_scope:RoguelikeRefreshCardCostUpdateNotify)
    private static final io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify();
    }

    public static io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoguelikeRefreshCardCostUpdateNotify>
        PARSER = new com.google.protobuf.AbstractParser<RoguelikeRefreshCardCostUpdateNotify>() {
      @java.lang.Override
      public RoguelikeRefreshCardCostUpdateNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoguelikeRefreshCardCostUpdateNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoguelikeRefreshCardCostUpdateNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RoguelikeRefreshCardCostUpdateNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.RoguelikeRefreshCardCostUpdateNotifyOuterClass.RoguelikeRefreshCardCostUpdateNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoguelikeRefreshCardCostUpdateNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoguelikeRefreshCardCostUpdateNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*RoguelikeRefreshCardCostUpdateNotify.p" +
      "roto\"K\n$RoguelikeRefreshCardCostUpdateNo" +
      "tify\022\022\n\nitem_count\030\005 \001(\r\022\017\n\007item_id\030\001 \001(" +
      "\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoguelikeRefreshCardCostUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoguelikeRefreshCardCostUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoguelikeRefreshCardCostUpdateNotify_descriptor,
        new java.lang.String[] { "ItemCount", "ItemId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}