// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StartArenaChallengeLevelRsp.proto

package io.grasscutter.proto;

public final class StartArenaChallengeLevelRspOuterClass {
  private StartArenaChallengeLevelRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface StartArenaChallengeLevelRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:StartArenaChallengeLevelRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 arena_challenge_level = 1;</code>
     * @return The arenaChallengeLevel.
     */
    int getArenaChallengeLevel();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 gadget_entity_id = 3;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();

    /**
     * <code>uint32 arena_challenge_id = 6;</code>
     * @return The arenaChallengeId.
     */
    int getArenaChallengeId();
  }
  /**
   * <pre>
   * CmdId: 2125
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code StartArenaChallengeLevelRsp}
   */
  public static final class StartArenaChallengeLevelRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:StartArenaChallengeLevelRsp)
      StartArenaChallengeLevelRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use StartArenaChallengeLevelRsp.newBuilder() to construct.
    private StartArenaChallengeLevelRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private StartArenaChallengeLevelRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new StartArenaChallengeLevelRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private StartArenaChallengeLevelRsp(
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

              arenaChallengeLevel_ = input.readUInt32();
              break;
            }
            case 24: {

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 48: {

              arenaChallengeId_ = input.readUInt32();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
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
      return io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.class, io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.Builder.class);
    }

    public static final int ARENA_CHALLENGE_LEVEL_FIELD_NUMBER = 1;
    private int arenaChallengeLevel_;
    /**
     * <code>uint32 arena_challenge_level = 1;</code>
     * @return The arenaChallengeLevel.
     */
    @java.lang.Override
    public int getArenaChallengeLevel() {
      return arenaChallengeLevel_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 3;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 3;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }

    public static final int ARENA_CHALLENGE_ID_FIELD_NUMBER = 6;
    private int arenaChallengeId_;
    /**
     * <code>uint32 arena_challenge_id = 6;</code>
     * @return The arenaChallengeId.
     */
    @java.lang.Override
    public int getArenaChallengeId() {
      return arenaChallengeId_;
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
      if (arenaChallengeLevel_ != 0) {
        output.writeUInt32(1, arenaChallengeLevel_);
      }
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(3, gadgetEntityId_);
      }
      if (arenaChallengeId_ != 0) {
        output.writeUInt32(6, arenaChallengeId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (arenaChallengeLevel_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, arenaChallengeLevel_);
      }
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, gadgetEntityId_);
      }
      if (arenaChallengeId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, arenaChallengeId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
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
      if (!(obj instanceof io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp other = (io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp) obj;

      if (getArenaChallengeLevel()
          != other.getArenaChallengeLevel()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
      if (getArenaChallengeId()
          != other.getArenaChallengeId()) return false;
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
      hash = (37 * hash) + ARENA_CHALLENGE_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + getArenaChallengeLevel();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (37 * hash) + ARENA_CHALLENGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getArenaChallengeId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp prototype) {
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
     * CmdId: 2125
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code StartArenaChallengeLevelRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:StartArenaChallengeLevelRsp)
        io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.class, io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.newBuilder()
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
        arenaChallengeLevel_ = 0;

        retcode_ = 0;

        gadgetEntityId_ = 0;

        arenaChallengeId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.internal_static_StartArenaChallengeLevelRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp build() {
        io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp buildPartial() {
        io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp result = new io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp(this);
        result.arenaChallengeLevel_ = arenaChallengeLevel_;
        result.retcode_ = retcode_;
        result.gadgetEntityId_ = gadgetEntityId_;
        result.arenaChallengeId_ = arenaChallengeId_;
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
        if (other instanceof io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp) {
          return mergeFrom((io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp other) {
        if (other == io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp.getDefaultInstance()) return this;
        if (other.getArenaChallengeLevel() != 0) {
          setArenaChallengeLevel(other.getArenaChallengeLevel());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
        }
        if (other.getArenaChallengeId() != 0) {
          setArenaChallengeId(other.getArenaChallengeId());
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
        io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int arenaChallengeLevel_ ;
      /**
       * <code>uint32 arena_challenge_level = 1;</code>
       * @return The arenaChallengeLevel.
       */
      @java.lang.Override
      public int getArenaChallengeLevel() {
        return arenaChallengeLevel_;
      }
      /**
       * <code>uint32 arena_challenge_level = 1;</code>
       * @param value The arenaChallengeLevel to set.
       * @return This builder for chaining.
       */
      public Builder setArenaChallengeLevel(int value) {
        
        arenaChallengeLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 arena_challenge_level = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearArenaChallengeLevel() {
        
        arenaChallengeLevel_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 3;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 3;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
        onChanged();
        return this;
      }

      private int arenaChallengeId_ ;
      /**
       * <code>uint32 arena_challenge_id = 6;</code>
       * @return The arenaChallengeId.
       */
      @java.lang.Override
      public int getArenaChallengeId() {
        return arenaChallengeId_;
      }
      /**
       * <code>uint32 arena_challenge_id = 6;</code>
       * @param value The arenaChallengeId to set.
       * @return This builder for chaining.
       */
      public Builder setArenaChallengeId(int value) {
        
        arenaChallengeId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 arena_challenge_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearArenaChallengeId() {
        
        arenaChallengeId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:StartArenaChallengeLevelRsp)
    }

    // @@protoc_insertion_point(class_scope:StartArenaChallengeLevelRsp)
    private static final io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp();
    }

    public static io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<StartArenaChallengeLevelRsp>
        PARSER = new com.google.protobuf.AbstractParser<StartArenaChallengeLevelRsp>() {
      @java.lang.Override
      public StartArenaChallengeLevelRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new StartArenaChallengeLevelRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<StartArenaChallengeLevelRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<StartArenaChallengeLevelRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.StartArenaChallengeLevelRspOuterClass.StartArenaChallengeLevelRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_StartArenaChallengeLevelRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_StartArenaChallengeLevelRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!StartArenaChallengeLevelRsp.proto\"\203\001\n\033" +
      "StartArenaChallengeLevelRsp\022\035\n\025arena_cha" +
      "llenge_level\030\001 \001(\r\022\017\n\007retcode\030\t \001(\005\022\030\n\020g" +
      "adget_entity_id\030\003 \001(\r\022\032\n\022arena_challenge" +
      "_id\030\006 \001(\rB\026\n\024io.grasscutter.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_StartArenaChallengeLevelRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_StartArenaChallengeLevelRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_StartArenaChallengeLevelRsp_descriptor,
        new java.lang.String[] { "ArenaChallengeLevel", "Retcode", "GadgetEntityId", "ArenaChallengeId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}