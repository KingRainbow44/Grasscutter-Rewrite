// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_ICLKJJNGOHN.proto

package io.grasscutter.proto;

public final class Unk3000ICLKJJNGOHN {
  private Unk3000ICLKJJNGOHN() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_ICLKJJNGOHNOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_ICLKJJNGOHN)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_finished = 10;</code>
     * @return The isFinished.
     */
    boolean getIsFinished();

    /**
     * <code>uint32 max_score = 3;</code>
     * @return The maxScore.
     */
    int getMaxScore();

    /**
     * <code>uint32 stage_id = 4;</code>
     * @return The stageId.
     */
    int getStageId();

    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    java.util.List<io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH> 
        getUnk2700GMAEHKMDIGGList();
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH getUnk2700GMAEHKMDIGG(int index);
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    int getUnk2700GMAEHKMDIGGCount();
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    java.util.List<? extends io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder> 
        getUnk2700GMAEHKMDIGGOrBuilderList();
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder getUnk2700GMAEHKMDIGGOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Unk3000_ICLKJJNGOHN}
   */
  public static final class Unk3000_ICLKJJNGOHN extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_ICLKJJNGOHN)
      Unk3000_ICLKJJNGOHNOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_ICLKJJNGOHN.newBuilder() to construct.
    private Unk3000_ICLKJJNGOHN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_ICLKJJNGOHN() {
      unk2700GMAEHKMDIGG_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_ICLKJJNGOHN();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_ICLKJJNGOHN(
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
            case 24: {

              maxScore_ = input.readUInt32();
              break;
            }
            case 32: {

              stageId_ = input.readUInt32();
              break;
            }
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700GMAEHKMDIGG_ = new java.util.ArrayList<io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700GMAEHKMDIGG_.add(
                  input.readMessage(io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.parser(), extensionRegistry));
              break;
            }
            case 80: {

              isFinished_ = input.readBool();
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
          unk2700GMAEHKMDIGG_ = java.util.Collections.unmodifiableList(unk2700GMAEHKMDIGG_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.Unk3000ICLKJJNGOHN.internal_static_Unk3000_ICLKJJNGOHN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk3000ICLKJJNGOHN.internal_static_Unk3000_ICLKJJNGOHN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN.class, io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN.Builder.class);
    }

    public static final int IS_FINISHED_FIELD_NUMBER = 10;
    private boolean isFinished_;
    /**
     * <code>bool is_finished = 10;</code>
     * @return The isFinished.
     */
    @java.lang.Override
    public boolean getIsFinished() {
      return isFinished_;
    }

    public static final int MAX_SCORE_FIELD_NUMBER = 3;
    private int maxScore_;
    /**
     * <code>uint32 max_score = 3;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }

    public static final int STAGE_ID_FIELD_NUMBER = 4;
    private int stageId_;
    /**
     * <code>uint32 stage_id = 4;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }

    public static final int UNK2700_GMAEHKMDIGG_FIELD_NUMBER = 6;
    private java.util.List<io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH> unk2700GMAEHKMDIGG_;
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH> getUnk2700GMAEHKMDIGGList() {
      return unk2700GMAEHKMDIGG_;
    }
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder> 
        getUnk2700GMAEHKMDIGGOrBuilderList() {
      return unk2700GMAEHKMDIGG_;
    }
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    @java.lang.Override
    public int getUnk2700GMAEHKMDIGGCount() {
      return unk2700GMAEHKMDIGG_.size();
    }
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH getUnk2700GMAEHKMDIGG(int index) {
      return unk2700GMAEHKMDIGG_.get(index);
    }
    /**
     * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder getUnk2700GMAEHKMDIGGOrBuilder(
        int index) {
      return unk2700GMAEHKMDIGG_.get(index);
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
      if (maxScore_ != 0) {
        output.writeUInt32(3, maxScore_);
      }
      if (stageId_ != 0) {
        output.writeUInt32(4, stageId_);
      }
      for (int i = 0; i < unk2700GMAEHKMDIGG_.size(); i++) {
        output.writeMessage(6, unk2700GMAEHKMDIGG_.get(i));
      }
      if (isFinished_ != false) {
        output.writeBool(10, isFinished_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (maxScore_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, maxScore_);
      }
      if (stageId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, stageId_);
      }
      for (int i = 0; i < unk2700GMAEHKMDIGG_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, unk2700GMAEHKMDIGG_.get(i));
      }
      if (isFinished_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(10, isFinished_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN other = (io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN) obj;

      if (getIsFinished()
          != other.getIsFinished()) return false;
      if (getMaxScore()
          != other.getMaxScore()) return false;
      if (getStageId()
          != other.getStageId()) return false;
      if (!getUnk2700GMAEHKMDIGGList()
          .equals(other.getUnk2700GMAEHKMDIGGList())) return false;
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
      hash = (37 * hash) + IS_FINISHED_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsFinished());
      hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getMaxScore();
      hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getStageId();
      if (getUnk2700GMAEHKMDIGGCount() > 0) {
        hash = (37 * hash) + UNK2700_GMAEHKMDIGG_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700GMAEHKMDIGGList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN prototype) {
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
     * Protobuf type {@code Unk3000_ICLKJJNGOHN}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_ICLKJJNGOHN)
        io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHNOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk3000ICLKJJNGOHN.internal_static_Unk3000_ICLKJJNGOHN_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk3000ICLKJJNGOHN.internal_static_Unk3000_ICLKJJNGOHN_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN.class, io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN.newBuilder()
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
          getUnk2700GMAEHKMDIGGFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isFinished_ = false;

        maxScore_ = 0;

        stageId_ = 0;

        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          unk2700GMAEHKMDIGG_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700GMAEHKMDIGGBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk3000ICLKJJNGOHN.internal_static_Unk3000_ICLKJJNGOHN_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN build() {
        io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN buildPartial() {
        io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN result = new io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN(this);
        int from_bitField0_ = bitField0_;
        result.isFinished_ = isFinished_;
        result.maxScore_ = maxScore_;
        result.stageId_ = stageId_;
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700GMAEHKMDIGG_ = java.util.Collections.unmodifiableList(unk2700GMAEHKMDIGG_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700GMAEHKMDIGG_ = unk2700GMAEHKMDIGG_;
        } else {
          result.unk2700GMAEHKMDIGG_ = unk2700GMAEHKMDIGGBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN) {
          return mergeFrom((io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN other) {
        if (other == io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN.getDefaultInstance()) return this;
        if (other.getIsFinished() != false) {
          setIsFinished(other.getIsFinished());
        }
        if (other.getMaxScore() != 0) {
          setMaxScore(other.getMaxScore());
        }
        if (other.getStageId() != 0) {
          setStageId(other.getStageId());
        }
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (!other.unk2700GMAEHKMDIGG_.isEmpty()) {
            if (unk2700GMAEHKMDIGG_.isEmpty()) {
              unk2700GMAEHKMDIGG_ = other.unk2700GMAEHKMDIGG_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700GMAEHKMDIGGIsMutable();
              unk2700GMAEHKMDIGG_.addAll(other.unk2700GMAEHKMDIGG_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700GMAEHKMDIGG_.isEmpty()) {
            if (unk2700GMAEHKMDIGGBuilder_.isEmpty()) {
              unk2700GMAEHKMDIGGBuilder_.dispose();
              unk2700GMAEHKMDIGGBuilder_ = null;
              unk2700GMAEHKMDIGG_ = other.unk2700GMAEHKMDIGG_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700GMAEHKMDIGGBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700GMAEHKMDIGGFieldBuilder() : null;
            } else {
              unk2700GMAEHKMDIGGBuilder_.addAllMessages(other.unk2700GMAEHKMDIGG_);
            }
          }
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
        io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean isFinished_ ;
      /**
       * <code>bool is_finished = 10;</code>
       * @return The isFinished.
       */
      @java.lang.Override
      public boolean getIsFinished() {
        return isFinished_;
      }
      /**
       * <code>bool is_finished = 10;</code>
       * @param value The isFinished to set.
       * @return This builder for chaining.
       */
      public Builder setIsFinished(boolean value) {
        
        isFinished_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_finished = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsFinished() {
        
        isFinished_ = false;
        onChanged();
        return this;
      }

      private int maxScore_ ;
      /**
       * <code>uint32 max_score = 3;</code>
       * @return The maxScore.
       */
      @java.lang.Override
      public int getMaxScore() {
        return maxScore_;
      }
      /**
       * <code>uint32 max_score = 3;</code>
       * @param value The maxScore to set.
       * @return This builder for chaining.
       */
      public Builder setMaxScore(int value) {
        
        maxScore_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 max_score = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMaxScore() {
        
        maxScore_ = 0;
        onChanged();
        return this;
      }

      private int stageId_ ;
      /**
       * <code>uint32 stage_id = 4;</code>
       * @return The stageId.
       */
      @java.lang.Override
      public int getStageId() {
        return stageId_;
      }
      /**
       * <code>uint32 stage_id = 4;</code>
       * @param value The stageId to set.
       * @return This builder for chaining.
       */
      public Builder setStageId(int value) {
        
        stageId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 stage_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearStageId() {
        
        stageId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH> unk2700GMAEHKMDIGG_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700GMAEHKMDIGGIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700GMAEHKMDIGG_ = new java.util.ArrayList<io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH>(unk2700GMAEHKMDIGG_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder> unk2700GMAEHKMDIGGBuilder_;

      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH> getUnk2700GMAEHKMDIGGList() {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700GMAEHKMDIGG_);
        } else {
          return unk2700GMAEHKMDIGGBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public int getUnk2700GMAEHKMDIGGCount() {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          return unk2700GMAEHKMDIGG_.size();
        } else {
          return unk2700GMAEHKMDIGGBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH getUnk2700GMAEHKMDIGG(int index) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          return unk2700GMAEHKMDIGG_.get(index);
        } else {
          return unk2700GMAEHKMDIGGBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder setUnk2700GMAEHKMDIGG(
          int index, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH value) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.set(index, value);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder setUnk2700GMAEHKMDIGG(
          int index, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder builderForValue) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder addUnk2700GMAEHKMDIGG(io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH value) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.add(value);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder addUnk2700GMAEHKMDIGG(
          int index, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH value) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.add(index, value);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder addUnk2700GMAEHKMDIGG(
          io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder builderForValue) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder addUnk2700GMAEHKMDIGG(
          int index, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder builderForValue) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder addAllUnk2700GMAEHKMDIGG(
          java.lang.Iterable<? extends io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH> values) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700GMAEHKMDIGG_);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder clearUnk2700GMAEHKMDIGG() {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          unk2700GMAEHKMDIGG_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public Builder removeUnk2700GMAEHKMDIGG(int index) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          ensureUnk2700GMAEHKMDIGGIsMutable();
          unk2700GMAEHKMDIGG_.remove(index);
          onChanged();
        } else {
          unk2700GMAEHKMDIGGBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder getUnk2700GMAEHKMDIGGBuilder(
          int index) {
        return getUnk2700GMAEHKMDIGGFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder getUnk2700GMAEHKMDIGGOrBuilder(
          int index) {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          return unk2700GMAEHKMDIGG_.get(index);  } else {
          return unk2700GMAEHKMDIGGBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder> 
           getUnk2700GMAEHKMDIGGOrBuilderList() {
        if (unk2700GMAEHKMDIGGBuilder_ != null) {
          return unk2700GMAEHKMDIGGBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700GMAEHKMDIGG_);
        }
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder addUnk2700GMAEHKMDIGGBuilder() {
        return getUnk2700GMAEHKMDIGGFieldBuilder().addBuilder(
            io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder addUnk2700GMAEHKMDIGGBuilder(
          int index) {
        return getUnk2700GMAEHKMDIGGFieldBuilder().addBuilder(
            index, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_KEJLPBEOHNH Unk2700_GMAEHKMDIGG = 6;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder> 
           getUnk2700GMAEHKMDIGGBuilderList() {
        return getUnk2700GMAEHKMDIGGFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder> 
          getUnk2700GMAEHKMDIGGFieldBuilder() {
        if (unk2700GMAEHKMDIGGBuilder_ == null) {
          unk2700GMAEHKMDIGGBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNH.Builder, io.grasscutter.proto.Unk3000KEJLPBEOHNH.Unk3000_KEJLPBEOHNHOrBuilder>(
                  unk2700GMAEHKMDIGG_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700GMAEHKMDIGG_ = null;
        }
        return unk2700GMAEHKMDIGGBuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_ICLKJJNGOHN)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_ICLKJJNGOHN)
    private static final io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN();
    }

    public static io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_ICLKJJNGOHN>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_ICLKJJNGOHN>() {
      @java.lang.Override
      public Unk3000_ICLKJJNGOHN parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_ICLKJJNGOHN(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_ICLKJJNGOHN> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_ICLKJJNGOHN> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk3000ICLKJJNGOHN.Unk3000_ICLKJJNGOHN getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_ICLKJJNGOHN_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_ICLKJJNGOHN_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_ICLKJJNGOHN.proto\032\031Unk3000_KEJ" +
      "LPBEOHNH.proto\"\202\001\n\023Unk3000_ICLKJJNGOHN\022\023" +
      "\n\013is_finished\030\n \001(\010\022\021\n\tmax_score\030\003 \001(\r\022\020" +
      "\n\010stage_id\030\004 \001(\r\0221\n\023Unk2700_GMAEHKMDIGG\030" +
      "\006 \003(\0132\024.Unk3000_KEJLPBEOHNHB\026\n\024io.grassc" +
      "utter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk3000KEJLPBEOHNH.getDescriptor(),
        });
    internal_static_Unk3000_ICLKJJNGOHN_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_ICLKJJNGOHN_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_ICLKJJNGOHN_descriptor,
        new java.lang.String[] { "IsFinished", "MaxScore", "StageId", "Unk2700GMAEHKMDIGG", });
    io.grasscutter.proto.Unk3000KEJLPBEOHNH.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}