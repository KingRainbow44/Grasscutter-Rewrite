// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk3000_FFOBEKMOHOI.proto

package io.grasscutter.proto;

public final class Unk3000FFOBEKMOHOI {
  private Unk3000FFOBEKMOHOI() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk3000_FFOBEKMOHOIOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk3000_FFOBEKMOHOI)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    java.util.List<io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME> 
        getUnk2700PHKHIPLDOOAList();
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME getUnk2700PHKHIPLDOOA(int index);
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    int getUnk2700PHKHIPLDOOACount();
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    java.util.List<? extends io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder> 
        getUnk2700PHKHIPLDOOAOrBuilderList();
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder getUnk2700PHKHIPLDOOAOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code Unk3000_FFOBEKMOHOI}
   */
  public static final class Unk3000_FFOBEKMOHOI extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk3000_FFOBEKMOHOI)
      Unk3000_FFOBEKMOHOIOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk3000_FFOBEKMOHOI.newBuilder() to construct.
    private Unk3000_FFOBEKMOHOI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk3000_FFOBEKMOHOI() {
      unk2700PHKHIPLDOOA_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk3000_FFOBEKMOHOI();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk3000_FFOBEKMOHOI(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                unk2700PHKHIPLDOOA_ = new java.util.ArrayList<io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME>();
                mutable_bitField0_ |= 0x00000001;
              }
              unk2700PHKHIPLDOOA_.add(
                  input.readMessage(io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.parser(), extensionRegistry));
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
          unk2700PHKHIPLDOOA_ = java.util.Collections.unmodifiableList(unk2700PHKHIPLDOOA_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.proto.Unk3000FFOBEKMOHOI.internal_static_Unk3000_FFOBEKMOHOI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk3000FFOBEKMOHOI.internal_static_Unk3000_FFOBEKMOHOI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI.class, io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI.Builder.class);
    }

    public static final int UNK2700_PHKHIPLDOOA_FIELD_NUMBER = 5;
    private java.util.List<io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME> unk2700PHKHIPLDOOA_;
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    @java.lang.Override
    public java.util.List<io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME> getUnk2700PHKHIPLDOOAList() {
      return unk2700PHKHIPLDOOA_;
    }
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder> 
        getUnk2700PHKHIPLDOOAOrBuilderList() {
      return unk2700PHKHIPLDOOA_;
    }
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    @java.lang.Override
    public int getUnk2700PHKHIPLDOOACount() {
      return unk2700PHKHIPLDOOA_.size();
    }
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME getUnk2700PHKHIPLDOOA(int index) {
      return unk2700PHKHIPLDOOA_.get(index);
    }
    /**
     * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder getUnk2700PHKHIPLDOOAOrBuilder(
        int index) {
      return unk2700PHKHIPLDOOA_.get(index);
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
      for (int i = 0; i < unk2700PHKHIPLDOOA_.size(); i++) {
        output.writeMessage(5, unk2700PHKHIPLDOOA_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < unk2700PHKHIPLDOOA_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, unk2700PHKHIPLDOOA_.get(i));
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
      if (!(obj instanceof io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI other = (io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI) obj;

      if (!getUnk2700PHKHIPLDOOAList()
          .equals(other.getUnk2700PHKHIPLDOOAList())) return false;
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
      if (getUnk2700PHKHIPLDOOACount() > 0) {
        hash = (37 * hash) + UNK2700_PHKHIPLDOOA_FIELD_NUMBER;
        hash = (53 * hash) + getUnk2700PHKHIPLDOOAList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI prototype) {
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
     * Protobuf type {@code Unk3000_FFOBEKMOHOI}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk3000_FFOBEKMOHOI)
        io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOIOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk3000FFOBEKMOHOI.internal_static_Unk3000_FFOBEKMOHOI_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk3000FFOBEKMOHOI.internal_static_Unk3000_FFOBEKMOHOI_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI.class, io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI.newBuilder()
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
          getUnk2700PHKHIPLDOOAFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          unk2700PHKHIPLDOOA_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          unk2700PHKHIPLDOOABuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk3000FFOBEKMOHOI.internal_static_Unk3000_FFOBEKMOHOI_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI build() {
        io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI buildPartial() {
        io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI result = new io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI(this);
        int from_bitField0_ = bitField0_;
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            unk2700PHKHIPLDOOA_ = java.util.Collections.unmodifiableList(unk2700PHKHIPLDOOA_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.unk2700PHKHIPLDOOA_ = unk2700PHKHIPLDOOA_;
        } else {
          result.unk2700PHKHIPLDOOA_ = unk2700PHKHIPLDOOABuilder_.build();
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
        if (other instanceof io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI) {
          return mergeFrom((io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI other) {
        if (other == io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI.getDefaultInstance()) return this;
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          if (!other.unk2700PHKHIPLDOOA_.isEmpty()) {
            if (unk2700PHKHIPLDOOA_.isEmpty()) {
              unk2700PHKHIPLDOOA_ = other.unk2700PHKHIPLDOOA_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureUnk2700PHKHIPLDOOAIsMutable();
              unk2700PHKHIPLDOOA_.addAll(other.unk2700PHKHIPLDOOA_);
            }
            onChanged();
          }
        } else {
          if (!other.unk2700PHKHIPLDOOA_.isEmpty()) {
            if (unk2700PHKHIPLDOOABuilder_.isEmpty()) {
              unk2700PHKHIPLDOOABuilder_.dispose();
              unk2700PHKHIPLDOOABuilder_ = null;
              unk2700PHKHIPLDOOA_ = other.unk2700PHKHIPLDOOA_;
              bitField0_ = (bitField0_ & ~0x00000001);
              unk2700PHKHIPLDOOABuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getUnk2700PHKHIPLDOOAFieldBuilder() : null;
            } else {
              unk2700PHKHIPLDOOABuilder_.addAllMessages(other.unk2700PHKHIPLDOOA_);
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
        io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME> unk2700PHKHIPLDOOA_ =
        java.util.Collections.emptyList();
      private void ensureUnk2700PHKHIPLDOOAIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          unk2700PHKHIPLDOOA_ = new java.util.ArrayList<io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME>(unk2700PHKHIPLDOOA_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder> unk2700PHKHIPLDOOABuilder_;

      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME> getUnk2700PHKHIPLDOOAList() {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          return java.util.Collections.unmodifiableList(unk2700PHKHIPLDOOA_);
        } else {
          return unk2700PHKHIPLDOOABuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public int getUnk2700PHKHIPLDOOACount() {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          return unk2700PHKHIPLDOOA_.size();
        } else {
          return unk2700PHKHIPLDOOABuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME getUnk2700PHKHIPLDOOA(int index) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          return unk2700PHKHIPLDOOA_.get(index);
        } else {
          return unk2700PHKHIPLDOOABuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder setUnk2700PHKHIPLDOOA(
          int index, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME value) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700PHKHIPLDOOAIsMutable();
          unk2700PHKHIPLDOOA_.set(index, value);
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder setUnk2700PHKHIPLDOOA(
          int index, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder builderForValue) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          ensureUnk2700PHKHIPLDOOAIsMutable();
          unk2700PHKHIPLDOOA_.set(index, builderForValue.build());
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder addUnk2700PHKHIPLDOOA(io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME value) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700PHKHIPLDOOAIsMutable();
          unk2700PHKHIPLDOOA_.add(value);
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder addUnk2700PHKHIPLDOOA(
          int index, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME value) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureUnk2700PHKHIPLDOOAIsMutable();
          unk2700PHKHIPLDOOA_.add(index, value);
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder addUnk2700PHKHIPLDOOA(
          io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder builderForValue) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          ensureUnk2700PHKHIPLDOOAIsMutable();
          unk2700PHKHIPLDOOA_.add(builderForValue.build());
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder addUnk2700PHKHIPLDOOA(
          int index, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder builderForValue) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          ensureUnk2700PHKHIPLDOOAIsMutable();
          unk2700PHKHIPLDOOA_.add(index, builderForValue.build());
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder addAllUnk2700PHKHIPLDOOA(
          java.lang.Iterable<? extends io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME> values) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          ensureUnk2700PHKHIPLDOOAIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, unk2700PHKHIPLDOOA_);
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder clearUnk2700PHKHIPLDOOA() {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          unk2700PHKHIPLDOOA_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public Builder removeUnk2700PHKHIPLDOOA(int index) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          ensureUnk2700PHKHIPLDOOAIsMutable();
          unk2700PHKHIPLDOOA_.remove(index);
          onChanged();
        } else {
          unk2700PHKHIPLDOOABuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder getUnk2700PHKHIPLDOOABuilder(
          int index) {
        return getUnk2700PHKHIPLDOOAFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder getUnk2700PHKHIPLDOOAOrBuilder(
          int index) {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          return unk2700PHKHIPLDOOA_.get(index);  } else {
          return unk2700PHKHIPLDOOABuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public java.util.List<? extends io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder> 
           getUnk2700PHKHIPLDOOAOrBuilderList() {
        if (unk2700PHKHIPLDOOABuilder_ != null) {
          return unk2700PHKHIPLDOOABuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(unk2700PHKHIPLDOOA_);
        }
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder addUnk2700PHKHIPLDOOABuilder() {
        return getUnk2700PHKHIPLDOOAFieldBuilder().addBuilder(
            io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder addUnk2700PHKHIPLDOOABuilder(
          int index) {
        return getUnk2700PHKHIPLDOOAFieldBuilder().addBuilder(
            index, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.getDefaultInstance());
      }
      /**
       * <code>repeated .Unk3000_FENDDMMFAME Unk2700_PHKHIPLDOOA = 5;</code>
       */
      public java.util.List<io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder> 
           getUnk2700PHKHIPLDOOABuilderList() {
        return getUnk2700PHKHIPLDOOAFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder> 
          getUnk2700PHKHIPLDOOAFieldBuilder() {
        if (unk2700PHKHIPLDOOABuilder_ == null) {
          unk2700PHKHIPLDOOABuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAME.Builder, io.grasscutter.proto.Unk3000FENDDMMFAME.Unk3000_FENDDMMFAMEOrBuilder>(
                  unk2700PHKHIPLDOOA_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          unk2700PHKHIPLDOOA_ = null;
        }
        return unk2700PHKHIPLDOOABuilder_;
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


      // @@protoc_insertion_point(builder_scope:Unk3000_FFOBEKMOHOI)
    }

    // @@protoc_insertion_point(class_scope:Unk3000_FFOBEKMOHOI)
    private static final io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI();
    }

    public static io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk3000_FFOBEKMOHOI>
        PARSER = new com.google.protobuf.AbstractParser<Unk3000_FFOBEKMOHOI>() {
      @java.lang.Override
      public Unk3000_FFOBEKMOHOI parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk3000_FFOBEKMOHOI(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk3000_FFOBEKMOHOI> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk3000_FFOBEKMOHOI> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk3000FFOBEKMOHOI.Unk3000_FFOBEKMOHOI getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk3000_FFOBEKMOHOI_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk3000_FFOBEKMOHOI_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk3000_FFOBEKMOHOI.proto\032\031Unk3000_FEN" +
      "DDMMFAME.proto\"H\n\023Unk3000_FFOBEKMOHOI\0221\n" +
      "\023Unk2700_PHKHIPLDOOA\030\005 \003(\0132\024.Unk3000_FEN" +
      "DDMMFAMEB\026\n\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk3000FENDDMMFAME.getDescriptor(),
        });
    internal_static_Unk3000_FFOBEKMOHOI_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk3000_FFOBEKMOHOI_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk3000_FFOBEKMOHOI_descriptor,
        new java.lang.String[] { "Unk2700PHKHIPLDOOA", });
    io.grasscutter.proto.Unk3000FENDDMMFAME.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}