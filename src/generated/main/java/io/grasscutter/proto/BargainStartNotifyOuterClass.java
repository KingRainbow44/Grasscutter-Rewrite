// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainStartNotify.proto

package io.grasscutter.proto;

public final class BargainStartNotifyOuterClass {
  private BargainStartNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BargainStartNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BargainStartNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 bargain_id = 4;</code>
     * @return The bargainId.
     */
    int getBargainId();

    /**
     * <code>.BargainSnapshot snapshot = 2;</code>
     * @return Whether the snapshot field is set.
     */
    boolean hasSnapshot();
    /**
     * <code>.BargainSnapshot snapshot = 2;</code>
     * @return The snapshot.
     */
    io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshot();
    /**
     * <code>.BargainSnapshot snapshot = 2;</code>
     */
    io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 404
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code BargainStartNotify}
   */
  public static final class BargainStartNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BargainStartNotify)
      BargainStartNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BargainStartNotify.newBuilder() to construct.
    private BargainStartNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BargainStartNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BargainStartNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BargainStartNotify(
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
            case 18: {
              io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder subBuilder = null;
              if (snapshot_ != null) {
                subBuilder = snapshot_.toBuilder();
              }
              snapshot_ = input.readMessage(io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(snapshot_);
                snapshot_ = subBuilder.buildPartial();
              }

              break;
            }
            case 32: {

              bargainId_ = input.readUInt32();
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
      return io.grasscutter.proto.BargainStartNotifyOuterClass.internal_static_BargainStartNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.BargainStartNotifyOuterClass.internal_static_BargainStartNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify.class, io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify.Builder.class);
    }

    public static final int BARGAIN_ID_FIELD_NUMBER = 4;
    private int bargainId_;
    /**
     * <code>uint32 bargain_id = 4;</code>
     * @return The bargainId.
     */
    @java.lang.Override
    public int getBargainId() {
      return bargainId_;
    }

    public static final int SNAPSHOT_FIELD_NUMBER = 2;
    private io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot snapshot_;
    /**
     * <code>.BargainSnapshot snapshot = 2;</code>
     * @return Whether the snapshot field is set.
     */
    @java.lang.Override
    public boolean hasSnapshot() {
      return snapshot_ != null;
    }
    /**
     * <code>.BargainSnapshot snapshot = 2;</code>
     * @return The snapshot.
     */
    @java.lang.Override
    public io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshot() {
      return snapshot_ == null ? io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
    }
    /**
     * <code>.BargainSnapshot snapshot = 2;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder() {
      return getSnapshot();
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
      if (snapshot_ != null) {
        output.writeMessage(2, getSnapshot());
      }
      if (bargainId_ != 0) {
        output.writeUInt32(4, bargainId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (snapshot_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getSnapshot());
      }
      if (bargainId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, bargainId_);
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
      if (!(obj instanceof io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify other = (io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify) obj;

      if (getBargainId()
          != other.getBargainId()) return false;
      if (hasSnapshot() != other.hasSnapshot()) return false;
      if (hasSnapshot()) {
        if (!getSnapshot()
            .equals(other.getSnapshot())) return false;
      }
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
      hash = (37 * hash) + BARGAIN_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBargainId();
      if (hasSnapshot()) {
        hash = (37 * hash) + SNAPSHOT_FIELD_NUMBER;
        hash = (53 * hash) + getSnapshot().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify prototype) {
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
     * CmdId: 404
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code BargainStartNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BargainStartNotify)
        io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.BargainStartNotifyOuterClass.internal_static_BargainStartNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.BargainStartNotifyOuterClass.internal_static_BargainStartNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify.class, io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify.newBuilder()
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
        bargainId_ = 0;

        if (snapshotBuilder_ == null) {
          snapshot_ = null;
        } else {
          snapshot_ = null;
          snapshotBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.BargainStartNotifyOuterClass.internal_static_BargainStartNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify build() {
        io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify buildPartial() {
        io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify result = new io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify(this);
        result.bargainId_ = bargainId_;
        if (snapshotBuilder_ == null) {
          result.snapshot_ = snapshot_;
        } else {
          result.snapshot_ = snapshotBuilder_.build();
        }
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
        if (other instanceof io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify) {
          return mergeFrom((io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify other) {
        if (other == io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify.getDefaultInstance()) return this;
        if (other.getBargainId() != 0) {
          setBargainId(other.getBargainId());
        }
        if (other.hasSnapshot()) {
          mergeSnapshot(other.getSnapshot());
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
        io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int bargainId_ ;
      /**
       * <code>uint32 bargain_id = 4;</code>
       * @return The bargainId.
       */
      @java.lang.Override
      public int getBargainId() {
        return bargainId_;
      }
      /**
       * <code>uint32 bargain_id = 4;</code>
       * @param value The bargainId to set.
       * @return This builder for chaining.
       */
      public Builder setBargainId(int value) {
        
        bargainId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 bargain_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainId() {
        
        bargainId_ = 0;
        onChanged();
        return this;
      }

      private io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot snapshot_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot, io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> snapshotBuilder_;
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       * @return Whether the snapshot field is set.
       */
      public boolean hasSnapshot() {
        return snapshotBuilder_ != null || snapshot_ != null;
      }
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       * @return The snapshot.
       */
      public io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot getSnapshot() {
        if (snapshotBuilder_ == null) {
          return snapshot_ == null ? io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
        } else {
          return snapshotBuilder_.getMessage();
        }
      }
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       */
      public Builder setSnapshot(io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          snapshot_ = value;
          onChanged();
        } else {
          snapshotBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       */
      public Builder setSnapshot(
          io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder builderForValue) {
        if (snapshotBuilder_ == null) {
          snapshot_ = builderForValue.build();
          onChanged();
        } else {
          snapshotBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       */
      public Builder mergeSnapshot(io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot value) {
        if (snapshotBuilder_ == null) {
          if (snapshot_ != null) {
            snapshot_ =
              io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.newBuilder(snapshot_).mergeFrom(value).buildPartial();
          } else {
            snapshot_ = value;
          }
          onChanged();
        } else {
          snapshotBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       */
      public Builder clearSnapshot() {
        if (snapshotBuilder_ == null) {
          snapshot_ = null;
          onChanged();
        } else {
          snapshot_ = null;
          snapshotBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       */
      public io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder getSnapshotBuilder() {
        
        onChanged();
        return getSnapshotFieldBuilder().getBuilder();
      }
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       */
      public io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder getSnapshotOrBuilder() {
        if (snapshotBuilder_ != null) {
          return snapshotBuilder_.getMessageOrBuilder();
        } else {
          return snapshot_ == null ?
              io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.getDefaultInstance() : snapshot_;
        }
      }
      /**
       * <code>.BargainSnapshot snapshot = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot, io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder> 
          getSnapshotFieldBuilder() {
        if (snapshotBuilder_ == null) {
          snapshotBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot, io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshot.Builder, io.grasscutter.proto.BargainSnapshotOuterClass.BargainSnapshotOrBuilder>(
                  getSnapshot(),
                  getParentForChildren(),
                  isClean());
          snapshot_ = null;
        }
        return snapshotBuilder_;
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


      // @@protoc_insertion_point(builder_scope:BargainStartNotify)
    }

    // @@protoc_insertion_point(class_scope:BargainStartNotify)
    private static final io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify();
    }

    public static io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BargainStartNotify>
        PARSER = new com.google.protobuf.AbstractParser<BargainStartNotify>() {
      @java.lang.Override
      public BargainStartNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BargainStartNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BargainStartNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BargainStartNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.BargainStartNotifyOuterClass.BargainStartNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BargainStartNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BargainStartNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030BargainStartNotify.proto\032\025BargainSnaps" +
      "hot.proto\"L\n\022BargainStartNotify\022\022\n\nbarga" +
      "in_id\030\004 \001(\r\022\"\n\010snapshot\030\002 \001(\0132\020.BargainS" +
      "napshotB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.BargainSnapshotOuterClass.getDescriptor(),
        });
    internal_static_BargainStartNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BargainStartNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BargainStartNotify_descriptor,
        new java.lang.String[] { "BargainId", "Snapshot", });
    io.grasscutter.proto.BargainSnapshotOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}