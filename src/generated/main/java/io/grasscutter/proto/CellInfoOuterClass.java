// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CellInfo.proto

package io.grasscutter.proto;

public final class CellInfoOuterClass {
  private CellInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CellInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CellInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.SceneSurfaceMaterial type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.SceneSurfaceMaterial type = 1;</code>
     * @return The type.
     */
    io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial getType();

    /**
     * <code>int32 y = 2;</code>
     * @return The y.
     */
    int getY();
  }
  /**
   * Protobuf type {@code CellInfo}
   */
  public static final class CellInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CellInfo)
      CellInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CellInfo.newBuilder() to construct.
    private CellInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CellInfo() {
      type_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CellInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CellInfo(
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
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
            case 16: {

              y_ = input.readInt32();
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
      return io.grasscutter.proto.CellInfoOuterClass.internal_static_CellInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.CellInfoOuterClass.internal_static_CellInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.CellInfoOuterClass.CellInfo.class, io.grasscutter.proto.CellInfoOuterClass.CellInfo.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>.SceneSurfaceMaterial type = 1;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.SceneSurfaceMaterial type = 1;</code>
     * @return The type.
     */
    @java.lang.Override public io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial getType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial result = io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial.valueOf(type_);
      return result == null ? io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial.UNRECOGNIZED : result;
    }

    public static final int Y_FIELD_NUMBER = 2;
    private int y_;
    /**
     * <code>int32 y = 2;</code>
     * @return The y.
     */
    @java.lang.Override
    public int getY() {
      return y_;
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
      if (type_ != io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial.SCENE_SURFACE_MATERIAL_INVALID.getNumber()) {
        output.writeEnum(1, type_);
      }
      if (y_ != 0) {
        output.writeInt32(2, y_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial.SCENE_SURFACE_MATERIAL_INVALID.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      if (y_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, y_);
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
      if (!(obj instanceof io.grasscutter.proto.CellInfoOuterClass.CellInfo)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.CellInfoOuterClass.CellInfo other = (io.grasscutter.proto.CellInfoOuterClass.CellInfo) obj;

      if (type_ != other.type_) return false;
      if (getY()
          != other.getY()) return false;
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
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + getY();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.CellInfoOuterClass.CellInfo prototype) {
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
     * Protobuf type {@code CellInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CellInfo)
        io.grasscutter.proto.CellInfoOuterClass.CellInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.CellInfoOuterClass.internal_static_CellInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.CellInfoOuterClass.internal_static_CellInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.CellInfoOuterClass.CellInfo.class, io.grasscutter.proto.CellInfoOuterClass.CellInfo.Builder.class);
      }

      // Construct using io.grasscutter.proto.CellInfoOuterClass.CellInfo.newBuilder()
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

        y_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.CellInfoOuterClass.internal_static_CellInfo_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.CellInfoOuterClass.CellInfo getDefaultInstanceForType() {
        return io.grasscutter.proto.CellInfoOuterClass.CellInfo.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.CellInfoOuterClass.CellInfo build() {
        io.grasscutter.proto.CellInfoOuterClass.CellInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.CellInfoOuterClass.CellInfo buildPartial() {
        io.grasscutter.proto.CellInfoOuterClass.CellInfo result = new io.grasscutter.proto.CellInfoOuterClass.CellInfo(this);
        result.type_ = type_;
        result.y_ = y_;
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
        if (other instanceof io.grasscutter.proto.CellInfoOuterClass.CellInfo) {
          return mergeFrom((io.grasscutter.proto.CellInfoOuterClass.CellInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.CellInfoOuterClass.CellInfo other) {
        if (other == io.grasscutter.proto.CellInfoOuterClass.CellInfo.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (other.getY() != 0) {
          setY(other.getY());
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
        io.grasscutter.proto.CellInfoOuterClass.CellInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.CellInfoOuterClass.CellInfo) e.getUnfinishedMessage();
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
       * <code>.SceneSurfaceMaterial type = 1;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.SceneSurfaceMaterial type = 1;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.SceneSurfaceMaterial type = 1;</code>
       * @return The type.
       */
      @java.lang.Override
      public io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial getType() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial result = io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial.valueOf(type_);
        return result == null ? io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial.UNRECOGNIZED : result;
      }
      /**
       * <code>.SceneSurfaceMaterial type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(io.grasscutter.proto.SceneSurfaceMaterialOuterClass.SceneSurfaceMaterial value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.SceneSurfaceMaterial type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int y_ ;
      /**
       * <code>int32 y = 2;</code>
       * @return The y.
       */
      @java.lang.Override
      public int getY() {
        return y_;
      }
      /**
       * <code>int32 y = 2;</code>
       * @param value The y to set.
       * @return This builder for chaining.
       */
      public Builder setY(int value) {
        
        y_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 y = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearY() {
        
        y_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CellInfo)
    }

    // @@protoc_insertion_point(class_scope:CellInfo)
    private static final io.grasscutter.proto.CellInfoOuterClass.CellInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.CellInfoOuterClass.CellInfo();
    }

    public static io.grasscutter.proto.CellInfoOuterClass.CellInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CellInfo>
        PARSER = new com.google.protobuf.AbstractParser<CellInfo>() {
      @java.lang.Override
      public CellInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CellInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CellInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CellInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.CellInfoOuterClass.CellInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CellInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CellInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016CellInfo.proto\032\032SceneSurfaceMaterial.p" +
      "roto\":\n\010CellInfo\022#\n\004type\030\001 \001(\0162\025.SceneSu" +
      "rfaceMaterial\022\t\n\001y\030\002 \001(\005B\026\n\024io.grasscutt" +
      "er.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.SceneSurfaceMaterialOuterClass.getDescriptor(),
        });
    internal_static_CellInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CellInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CellInfo_descriptor,
        new java.lang.String[] { "Type", "Y", });
    io.grasscutter.proto.SceneSurfaceMaterialOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}