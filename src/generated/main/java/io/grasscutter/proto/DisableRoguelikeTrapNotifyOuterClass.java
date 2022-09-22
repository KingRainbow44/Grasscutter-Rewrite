// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DisableRoguelikeTrapNotify.proto

package io.grasscutter.proto;

public final class DisableRoguelikeTrapNotifyOuterClass {
  private DisableRoguelikeTrapNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DisableRoguelikeTrapNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DisableRoguelikeTrapNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_id = 13;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   * CmdId: 8259
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code DisableRoguelikeTrapNotify}
   */
  public static final class DisableRoguelikeTrapNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DisableRoguelikeTrapNotify)
      DisableRoguelikeTrapNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DisableRoguelikeTrapNotify.newBuilder() to construct.
    private DisableRoguelikeTrapNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DisableRoguelikeTrapNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DisableRoguelikeTrapNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DisableRoguelikeTrapNotify(
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
            case 104: {

              cardId_ = input.readUInt32();
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
      return io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.internal_static_DisableRoguelikeTrapNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.internal_static_DisableRoguelikeTrapNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify.class, io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify.Builder.class);
    }

    public static final int CARD_ID_FIELD_NUMBER = 13;
    private int cardId_;
    /**
     * <code>uint32 card_id = 13;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (cardId_ != 0) {
        output.writeUInt32(13, cardId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, cardId_);
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
      if (!(obj instanceof io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify other = (io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify) obj;

      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify prototype) {
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
     * CmdId: 8259
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code DisableRoguelikeTrapNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DisableRoguelikeTrapNotify)
        io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.internal_static_DisableRoguelikeTrapNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.internal_static_DisableRoguelikeTrapNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify.class, io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify.newBuilder()
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
        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.internal_static_DisableRoguelikeTrapNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify build() {
        io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify buildPartial() {
        io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify result = new io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify(this);
        result.cardId_ = cardId_;
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
        if (other instanceof io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify) {
          return mergeFrom((io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify other) {
        if (other == io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify.getDefaultInstance()) return this;
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 13;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 13;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DisableRoguelikeTrapNotify)
    }

    // @@protoc_insertion_point(class_scope:DisableRoguelikeTrapNotify)
    private static final io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify();
    }

    public static io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DisableRoguelikeTrapNotify>
        PARSER = new com.google.protobuf.AbstractParser<DisableRoguelikeTrapNotify>() {
      @java.lang.Override
      public DisableRoguelikeTrapNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DisableRoguelikeTrapNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DisableRoguelikeTrapNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DisableRoguelikeTrapNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.DisableRoguelikeTrapNotifyOuterClass.DisableRoguelikeTrapNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DisableRoguelikeTrapNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DisableRoguelikeTrapNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n DisableRoguelikeTrapNotify.proto\"-\n\032Di" +
      "sableRoguelikeTrapNotify\022\017\n\007card_id\030\r \001(" +
      "\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DisableRoguelikeTrapNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DisableRoguelikeTrapNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DisableRoguelikeTrapNotify_descriptor,
        new java.lang.String[] { "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}