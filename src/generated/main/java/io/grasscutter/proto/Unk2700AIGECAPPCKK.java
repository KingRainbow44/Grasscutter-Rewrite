// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_AIGECAPPCKK.proto

package io.grasscutter.proto;

public final class Unk2700AIGECAPPCKK {
  private Unk2700AIGECAPPCKK() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_AIGECAPPCKKOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_AIGECAPPCKK)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    java.util.List<io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD> 
        getUnk2700AEJIIOOPJILList();
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD getUnk2700AEJIIOOPJIL(int index);
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    int getUnk2700AEJIIOOPJILCount();
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    java.util.List<? extends io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder> 
        getUnk2700AEJIIOOPJILOrBuilderList();
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder getUnk2700AEJIIOOPJILOrBuilder(
        int index);

    /**
     * <code>uint32 Unk2700_HNCBHBKDODH = 14;</code>
     * @return The unk2700HNCBHBKDODH.
     */
    int getUnk2700HNCBHBKDODH();
  }
  /**
   * Protobuf type {@code Unk2700_AIGECAPPCKK}
   */
  public static final class Unk2700_AIGECAPPCKK extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_AIGECAPPCKK)
      Unk2700_AIGECAPPCKKOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_AIGECAPPCKK.newBuilder() to construct.
    private Unk2700_AIGECAPPCKK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_AIGECAPPCKK() {
      unk2700AEJIIOOPJIL_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_AIGECAPPCKK();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_AIGECAPPCKK(
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
            case 26: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700AEJIIOOPJIL_ = new java.util.ArrayList<io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700AEJIIOOPJIL_.add(
                  input.readMessage(io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.parser(), extensionRegistry));
              break;
            }
            case 112: {

              unk2700HNCBHBKDODH_ = input.readUInt32();
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
          unk2700AEJIIOOPJIL_ = java.util.Collections.unmodifiableList(unk2700AEJIIOOPJIL_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.Unk2700AIGECAPPCKK.internal_static_Unk2700_AIGECAPPCKK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700AIGECAPPCKK.internal_static_Unk2700_AIGECAPPCKK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK.class, io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK.Builder.class);
    }

    public static final int UNK2700_AEJIIOOPJIL_FIELD_NUMBER = 3;
    private java.util.List<io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD> unk2700AEJIIOOPJIL_;
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD> getUnk2700AEJIIOOPJILList() {
      return unk2700AEJIIOOPJIL_;
    }
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder> 
        getUnk2700AEJIIOOPJILOrBuilderList() {
      return unk2700AEJIIOOPJIL_;
    }
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    @java.lang.Override
    public int getUnk2700AEJIIOOPJILCount() {
      return unk2700AEJIIOOPJIL_.size();
    }
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD getUnk2700AEJIIOOPJIL(int index) {
      return unk2700AEJIIOOPJIL_.get(index);
    }
    /**
     * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder getUnk2700AEJIIOOPJILOrBuilder(
        int index) {
      return unk2700AEJIIOOPJIL_.get(index);
    }

    public static final int UNK2700_HNCBHBKDODH_FIELD_NUMBER = 14;
    private int unk2700HNCBHBKDODH_;
    /**
     * <code>uint32 Unk2700_HNCBHBKDODH = 14;</code>
     * @return The unk2700HNCBHBKDODH.
     */
    @java.lang.Override
    public int getUnk2700HNCBHBKDODH() {
      return unk2700HNCBHBKDODH_;
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
      for (int i = 0; i < unk2700AEJIIOOPJIL_.size(); i++) {
        output.writeMessage(3, unk2700AEJIIOOPJIL_.get(i));
      }
      if (unk2700HNCBHBKDODH_ != 0) {
        output.writeUInt32(14, unk2700HNCBHBKDODH_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700AEJIIOOPJIL_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, unk2700AEJIIOOPJIL_.get(i));
      }
      if (unk2700HNCBHBKDODH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, unk2700HNCBHBKDODH_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK other = (io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK) obj;

      if (!getUnk2700AEJIIOOPJILList()
          .equals(other.getUnk2700AEJIIOOPJILList())) return false;
      if (getUnk2700HNCBHBKDODH()
          != other.getUnk2700HNCBHBKDODH()) return false;
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
      if (getUnk2700AEJIIOOPJILCount() > 0) {
        hash = (37 * hash) + UNK2700_AEJIIOOPJIL_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700AEJIIOOPJILList().hashCode();
      }
      hash = (37 * hash) + UNK2700_HNCBHBKDODH_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700HNCBHBKDODH();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK prototype) {
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
     * Protobuf type {@code Unk2700_AIGECAPPCKK}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_AIGECAPPCKK)
        io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKKOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700AIGECAPPCKK.internal_static_Unk2700_AIGECAPPCKK_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700AIGECAPPCKK.internal_static_Unk2700_AIGECAPPCKK_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK.class, io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK.newBuilder()
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
          getUnk2700AEJIIOOPJILFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          unk2700AEJIIOOPJIL_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700AEJIIOOPJILBuilder_.clear();
        }
        unk2700HNCBHBKDODH_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700AIGECAPPCKK.internal_static_Unk2700_AIGECAPPCKK_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK build() {
        io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK buildPartial() {
        io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK result = new io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK(this);
        int from_bitField0_ = bitField0_;
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700AEJIIOOPJIL_ = java.util.Collections.unmodifiableList(unk2700AEJIIOOPJIL_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700AEJIIOOPJIL_ = unk2700AEJIIOOPJIL_;
        } else {
          result.unk2700AEJIIOOPJIL_ = unk2700AEJIIOOPJILBuilder_.build();
        }
        result.unk2700HNCBHBKDODH_ = unk2700HNCBHBKDODH_;
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
        if (other instanceof io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK) {
          return mergeFrom((io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK other) {
        if (other == io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK.getDefaultInstance()) return this;
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          if (!other.unk2700AEJIIOOPJIL_.isEmpty()) {
            if (unk2700AEJIIOOPJIL_.isEmpty()) {
              unk2700AEJIIOOPJIL_ = other.unk2700AEJIIOOPJIL_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700AEJIIOOPJILIsMutable();
              unk2700AEJIIOOPJIL_.addAll(other.unk2700AEJIIOOPJIL_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700AEJIIOOPJIL_.isEmpty()) {
            if (unk2700AEJIIOOPJILBuilder_.isEmpty()) {
              unk2700AEJIIOOPJILBuilder_.dispose();
              unk2700AEJIIOOPJILBuilder_ = null;
              unk2700AEJIIOOPJIL_ = other.unk2700AEJIIOOPJIL_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700AEJIIOOPJILBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700AEJIIOOPJILFieldBuilder() : null;
            } else {
              unk2700AEJIIOOPJILBuilder_.addAllMessages(other.unk2700AEJIIOOPJIL_);
            }
          }
        }
        if (other.getUnk2700HNCBHBKDODH() != 0) {
          setUnk2700HNCBHBKDODH(other.getUnk2700HNCBHBKDODH());
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
        io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD> unk2700AEJIIOOPJIL_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700AEJIIOOPJILIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700AEJIIOOPJIL_ = new java.util.ArrayList<io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD>(unk2700AEJIIOOPJIL_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder> unk2700AEJIIOOPJILBuilder_;

      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD> getUnk2700AEJIIOOPJILList() {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700AEJIIOOPJIL_);
        } else {
          return unk2700AEJIIOOPJILBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public int getUnk2700AEJIIOOPJILCount() {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          return unk2700AEJIIOOPJIL_.size();
        } else {
          return unk2700AEJIIOOPJILBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD getUnk2700AEJIIOOPJIL(int index) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          return unk2700AEJIIOOPJIL_.get(index);
        } else {
          return unk2700AEJIIOOPJILBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder setUnk2700AEJIIOOPJIL(
          int index, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD value) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700AEJIIOOPJILIsMutable();
          unk2700AEJIIOOPJIL_.set(index, value);
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder setUnk2700AEJIIOOPJIL(
          int index, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder builderForValue) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          ensureUnk2700AEJIIOOPJILIsMutable();
          unk2700AEJIIOOPJIL_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder addUnk2700AEJIIOOPJIL(io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD value) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700AEJIIOOPJILIsMutable();
          unk2700AEJIIOOPJIL_.add(value);
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder addUnk2700AEJIIOOPJIL(
          int index, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD value) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700AEJIIOOPJILIsMutable();
          unk2700AEJIIOOPJIL_.add(index, value);
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder addUnk2700AEJIIOOPJIL(
          io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder builderForValue) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          ensureUnk2700AEJIIOOPJILIsMutable();
          unk2700AEJIIOOPJIL_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder addUnk2700AEJIIOOPJIL(
          int index, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder builderForValue) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          ensureUnk2700AEJIIOOPJILIsMutable();
          unk2700AEJIIOOPJIL_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder addAllUnk2700AEJIIOOPJIL(
          java.lang.Iterable<? extends io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD> values) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          ensureUnk2700AEJIIOOPJILIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700AEJIIOOPJIL_);
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder clearUnk2700AEJIIOOPJIL() {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          unk2700AEJIIOOPJIL_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public Builder removeUnk2700AEJIIOOPJIL(int index) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          ensureUnk2700AEJIIOOPJILIsMutable();
          unk2700AEJIIOOPJIL_.remove(index);
          onChanged();
        } else {
          unk2700AEJIIOOPJILBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder getUnk2700AEJIIOOPJILBuilder(
          int index) {
        return getUnk2700AEJIIOOPJILFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder getUnk2700AEJIIOOPJILOrBuilder(
          int index) {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          return unk2700AEJIIOOPJIL_.get(index);  } else {
          return unk2700AEJIIOOPJILBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder> 
           getUnk2700AEJIIOOPJILOrBuilderList() {
        if (unk2700AEJIIOOPJILBuilder_ != null) {
          return unk2700AEJIIOOPJILBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700AEJIIOOPJIL_);
        }
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder addUnk2700AEJIIOOPJILBuilder() {
        return getUnk2700AEJIIOOPJILFieldBuilder().addBuilder(
            io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder addUnk2700AEJIIOOPJILBuilder(
          int index) {
        return getUnk2700AEJIIOOPJILFieldBuilder().addBuilder(
            index, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk2700_HIHKGMLLOGD Unk2700_AEJIIOOPJIL = 3;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder> 
           getUnk2700AEJIIOOPJILBuilderList() {
        return getUnk2700AEJIIOOPJILFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder> 
          getUnk2700AEJIIOOPJILFieldBuilder() {
        if (unk2700AEJIIOOPJILBuilder_ == null) {
          unk2700AEJIIOOPJILBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGD.Builder, io.grasscutter.proto.Unk2700HIHKGMLLOGD.Unk2700_HIHKGMLLOGDOrBuilder>(
                  unk2700AEJIIOOPJIL_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700AEJIIOOPJIL_ = null;
        }
        return unk2700AEJIIOOPJILBuilder_;
      }

      private int unk2700HNCBHBKDODH_ ;
      /**
       * <code>uint32 Unk2700_HNCBHBKDODH = 14;</code>
       * @return The unk2700HNCBHBKDODH.
       */
      @java.lang.Override
      public int getUnk2700HNCBHBKDODH() {
        return unk2700HNCBHBKDODH_;
      }
      /**
       * <code>uint32 Unk2700_HNCBHBKDODH = 14;</code>
       * @param value The unk2700HNCBHBKDODH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700HNCBHBKDODH(int value) {
        
        unk2700HNCBHBKDODH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_HNCBHBKDODH = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700HNCBHBKDODH() {
        
        unk2700HNCBHBKDODH_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_AIGECAPPCKK)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_AIGECAPPCKK)
    private static final io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK();
    }

    public static io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_AIGECAPPCKK>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_AIGECAPPCKK>() {
      @java.lang.Override
      public Unk2700_AIGECAPPCKK parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_AIGECAPPCKK(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_AIGECAPPCKK> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_AIGECAPPCKK> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700AIGECAPPCKK.Unk2700_AIGECAPPCKK getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_AIGECAPPCKK_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_AIGECAPPCKK_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_AIGECAPPCKK.proto\032\031Unk2700_HIH" +
      "KGMLLOGD.proto\"e\n\023Unk2700_AIGECAPPCKK\0221\n" +
      "\023Unk2700_AEJIIOOPJIL\030\003 \003(\0132\024.Unk2700_HIH" +
      "KGMLLOGD\022\033\n\023Unk2700_HNCBHBKDODH\030\016 \001(\rB\026\n" +
      "\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2700HIHKGMLLOGD.getDescriptor(),
        });
    internal_static_Unk2700_AIGECAPPCKK_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_AIGECAPPCKK_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_AIGECAPPCKK_descriptor,
        new java.lang.String[] { "Unk2700AEJIIOOPJIL", "Unk2700HNCBHBKDODH", });
    io.grasscutter.proto.Unk2700HIHKGMLLOGD.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}