// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayerMatchStopNotify.proto

package io.grasscutter.proto;

public final class PlayerMatchStopNotifyOuterClass {
  private PlayerMatchStopNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PlayerMatchStopNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PlayerMatchStopNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MatchReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    int getReasonValue();
    /**
     * <code>.MatchReason reason = 1;</code>
     * @return The reason.
     */
    io.grasscutter.proto.MatchReasonOuterClass.MatchReason getReason();

    /**
     * <code>uint32 host_uid = 12;</code>
     * @return The hostUid.
     */
    int getHostUid();
  }
  /**
   * <pre>
   * CmdId: 4181
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code PlayerMatchStopNotify}
   */
  public static final class PlayerMatchStopNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PlayerMatchStopNotify)
      PlayerMatchStopNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PlayerMatchStopNotify.newBuilder() to construct.
    private PlayerMatchStopNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PlayerMatchStopNotify() {
      reason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PlayerMatchStopNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PlayerMatchStopNotify(
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

              reason_ = rawValue;
              break;
            }
            case 96: {

              hostUid_ = input.readUInt32();
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
      return io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.class, io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.Builder.class);
    }

    public static final int REASON_FIELD_NUMBER = 1;
    private int reason_;
    /**
     * <code>.MatchReason reason = 1;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.MatchReason reason = 1;</code>
     * @return The reason.
     */
    @java.lang.Override public io.grasscutter.proto.MatchReasonOuterClass.MatchReason getReason() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.MatchReasonOuterClass.MatchReason result = io.grasscutter.proto.MatchReasonOuterClass.MatchReason.valueOf(reason_);
      return result == null ? io.grasscutter.proto.MatchReasonOuterClass.MatchReason.UNRECOGNIZED : result;
    }

    public static final int HOST_UID_FIELD_NUMBER = 12;
    private int hostUid_;
    /**
     * <code>uint32 host_uid = 12;</code>
     * @return The hostUid.
     */
    @java.lang.Override
    public int getHostUid() {
      return hostUid_;
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
      if (reason_ != io.grasscutter.proto.MatchReasonOuterClass.MatchReason.MATCH_REASON_NONE.getNumber()) {
        output.writeEnum(1, reason_);
      }
      if (hostUid_ != 0) {
        output.writeUInt32(12, hostUid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (reason_ != io.grasscutter.proto.MatchReasonOuterClass.MatchReason.MATCH_REASON_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, reason_);
      }
      if (hostUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, hostUid_);
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
      if (!(obj instanceof io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify other = (io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify) obj;

      if (reason_ != other.reason_) return false;
      if (getHostUid()
          != other.getHostUid()) return false;
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
      hash = (37 * hash) + REASON_FIELD_NUMBER;
      hash = (53 * hash) + reason_;
      hash = (37 * hash) + HOST_UID_FIELD_NUMBER;
      hash = (53 * hash) + getHostUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify prototype) {
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
     * CmdId: 4181
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code PlayerMatchStopNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PlayerMatchStopNotify)
        io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.class, io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.newBuilder()
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
        reason_ = 0;

        hostUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.internal_static_PlayerMatchStopNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify build() {
        io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify buildPartial() {
        io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify result = new io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify(this);
        result.reason_ = reason_;
        result.hostUid_ = hostUid_;
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
        if (other instanceof io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify) {
          return mergeFrom((io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify other) {
        if (other == io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify.getDefaultInstance()) return this;
        if (other.reason_ != 0) {
          setReasonValue(other.getReasonValue());
        }
        if (other.getHostUid() != 0) {
          setHostUid(other.getHostUid());
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
        io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int reason_ = 0;
      /**
       * <code>.MatchReason reason = 1;</code>
       * @return The enum numeric value on the wire for reason.
       */
      @java.lang.Override public int getReasonValue() {
        return reason_;
      }
      /**
       * <code>.MatchReason reason = 1;</code>
       * @param value The enum numeric value on the wire for reason to set.
       * @return This builder for chaining.
       */
      public Builder setReasonValue(int value) {
        
        reason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MatchReason reason = 1;</code>
       * @return The reason.
       */
      @java.lang.Override
      public io.grasscutter.proto.MatchReasonOuterClass.MatchReason getReason() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.MatchReasonOuterClass.MatchReason result = io.grasscutter.proto.MatchReasonOuterClass.MatchReason.valueOf(reason_);
        return result == null ? io.grasscutter.proto.MatchReasonOuterClass.MatchReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.MatchReason reason = 1;</code>
       * @param value The reason to set.
       * @return This builder for chaining.
       */
      public Builder setReason(io.grasscutter.proto.MatchReasonOuterClass.MatchReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        reason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MatchReason reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearReason() {
        
        reason_ = 0;
        onChanged();
        return this;
      }

      private int hostUid_ ;
      /**
       * <code>uint32 host_uid = 12;</code>
       * @return The hostUid.
       */
      @java.lang.Override
      public int getHostUid() {
        return hostUid_;
      }
      /**
       * <code>uint32 host_uid = 12;</code>
       * @param value The hostUid to set.
       * @return This builder for chaining.
       */
      public Builder setHostUid(int value) {
        
        hostUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 host_uid = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearHostUid() {
        
        hostUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:PlayerMatchStopNotify)
    }

    // @@protoc_insertion_point(class_scope:PlayerMatchStopNotify)
    private static final io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify();
    }

    public static io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PlayerMatchStopNotify>
        PARSER = new com.google.protobuf.AbstractParser<PlayerMatchStopNotify>() {
      @java.lang.Override
      public PlayerMatchStopNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PlayerMatchStopNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PlayerMatchStopNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PlayerMatchStopNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.PlayerMatchStopNotifyOuterClass.PlayerMatchStopNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerMatchStopNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerMatchStopNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033PlayerMatchStopNotify.proto\032\021MatchReas" +
      "on.proto\"G\n\025PlayerMatchStopNotify\022\034\n\006rea" +
      "son\030\001 \001(\0162\014.MatchReason\022\020\n\010host_uid\030\014 \001(" +
      "\rB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.MatchReasonOuterClass.getDescriptor(),
        });
    internal_static_PlayerMatchStopNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PlayerMatchStopNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerMatchStopNotify_descriptor,
        new java.lang.String[] { "Reason", "HostUid", });
    io.grasscutter.proto.MatchReasonOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}