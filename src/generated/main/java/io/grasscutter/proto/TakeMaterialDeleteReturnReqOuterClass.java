// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TakeMaterialDeleteReturnReq.proto

package io.grasscutter.proto;

public final class TakeMaterialDeleteReturnReqOuterClass {
  private TakeMaterialDeleteReturnReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TakeMaterialDeleteReturnReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TakeMaterialDeleteReturnReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MaterialDeleteReturnType type = 8;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.MaterialDeleteReturnType type = 8;</code>
     * @return The type.
     */
    io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType getType();
  }
  /**
   * <pre>
   * CmdId: 629
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code TakeMaterialDeleteReturnReq}
   */
  public static final class TakeMaterialDeleteReturnReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TakeMaterialDeleteReturnReq)
      TakeMaterialDeleteReturnReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TakeMaterialDeleteReturnReq.newBuilder() to construct.
    private TakeMaterialDeleteReturnReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TakeMaterialDeleteReturnReq() {
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TakeMaterialDeleteReturnReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TakeMaterialDeleteReturnReq(
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
              int rawValue = input.readEnum();

              type_ = rawValue;
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
      return io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.internal_static_TakeMaterialDeleteReturnReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.internal_static_TakeMaterialDeleteReturnReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq.class, io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 8;
    private int type_;
    /**
     * <code>.MaterialDeleteReturnType type = 8;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.MaterialDeleteReturnType type = 8;</code>
     * @return The type.
     */
    @java.lang.Override public io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType getType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType result = io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType.valueOf(type_);
      return result == null ? io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType.UNRECOGNIZED : result;
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
      if (type_ != io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType.MATERIAL_DELETE_RETURN_TYPE_BAG.getNumber()) {
        output.writeEnum(8, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType.MATERIAL_DELETE_RETURN_TYPE_BAG.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(8, type_);
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
      if (!(obj instanceof io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq other = (io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq) obj;

      if (type_ != other.type_) return false;
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
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq prototype) {
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
     * CmdId: 629
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code TakeMaterialDeleteReturnReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TakeMaterialDeleteReturnReq)
        io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.internal_static_TakeMaterialDeleteReturnReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.internal_static_TakeMaterialDeleteReturnReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq.class, io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq.Builder.class);
      }

      // Construct using io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq.newBuilder()
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
        type_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.internal_static_TakeMaterialDeleteReturnReq_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq getDefaultInstanceForType() {
        return io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq build() {
        io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq buildPartial() {
        io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq result = new io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq(this);
        result.type_ = type_;
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
        if (other instanceof io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq) {
          return mergeFrom((io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq other) {
        if (other == io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
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
        io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.MaterialDeleteReturnType type = 8;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.MaterialDeleteReturnType type = 8;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MaterialDeleteReturnType type = 8;</code>
       * @return The type.
       */
      @java.lang.Override
      public io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType getType() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType result = io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType.valueOf(type_);
        return result == null ? io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType.UNRECOGNIZED : result;
      }
      /**
       * <code>.MaterialDeleteReturnType type = 8;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.MaterialDeleteReturnType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MaterialDeleteReturnType type = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TakeMaterialDeleteReturnReq)
    }

    // @@protoc_insertion_point(class_scope:TakeMaterialDeleteReturnReq)
    private static final io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq();
    }

    public static io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TakeMaterialDeleteReturnReq>
        PARSER = new com.google.protobuf.AbstractParser<TakeMaterialDeleteReturnReq>() {
      @java.lang.Override
      public TakeMaterialDeleteReturnReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TakeMaterialDeleteReturnReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TakeMaterialDeleteReturnReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TakeMaterialDeleteReturnReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.TakeMaterialDeleteReturnReqOuterClass.TakeMaterialDeleteReturnReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TakeMaterialDeleteReturnReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TakeMaterialDeleteReturnReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!TakeMaterialDeleteReturnReq.proto\032\036Mat" +
      "erialDeleteReturnType.proto\"F\n\033TakeMater" +
      "ialDeleteReturnReq\022\'\n\004type\030\010 \001(\0162\031.Mater" +
      "ialDeleteReturnTypeB\026\n\024io.grasscutter.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.getDescriptor(),
        });
    internal_static_TakeMaterialDeleteReturnReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TakeMaterialDeleteReturnReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TakeMaterialDeleteReturnReq_descriptor,
        new java.lang.String[] { "Type", });
    io.grasscutter.proto.MaterialDeleteReturnTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}