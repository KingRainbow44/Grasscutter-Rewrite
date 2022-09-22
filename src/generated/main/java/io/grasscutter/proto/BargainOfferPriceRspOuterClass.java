// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BargainOfferPriceRsp.proto

package io.grasscutter.proto;

public final class BargainOfferPriceRspOuterClass {
  private BargainOfferPriceRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BargainOfferPriceRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BargainOfferPriceRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 result_param = 13;</code>
     * @return The resultParam.
     */
    int getResultParam();

    /**
     * <code>.BargainResultType bargain_result = 14;</code>
     * @return The enum numeric value on the wire for bargainResult.
     */
    int getBargainResultValue();
    /**
     * <code>.BargainResultType bargain_result = 14;</code>
     * @return The bargainResult.
     */
    io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType getBargainResult();

    /**
     * <code>int32 cur_mood = 6;</code>
     * @return The curMood.
     */
    int getCurMood();
  }
  /**
   * <pre>
   * CmdId: 427
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code BargainOfferPriceRsp}
   */
  public static final class BargainOfferPriceRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BargainOfferPriceRsp)
      BargainOfferPriceRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BargainOfferPriceRsp.newBuilder() to construct.
    private BargainOfferPriceRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BargainOfferPriceRsp() {
      bargainResult_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BargainOfferPriceRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BargainOfferPriceRsp(
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
            case 40: {

              retcode_ = input.readInt32();
              break;
            }
            case 48: {

              curMood_ = input.readInt32();
              break;
            }
            case 104: {

              resultParam_ = input.readUInt32();
              break;
            }
            case 112: {
              int rawValue = input.readEnum();

              bargainResult_ = rawValue;
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
      return io.grasscutter.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.class, io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 5;
    private int retcode_;
    /**
     * <code>int32 retcode = 5;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int RESULT_PARAM_FIELD_NUMBER = 13;
    private int resultParam_;
    /**
     * <code>uint32 result_param = 13;</code>
     * @return The resultParam.
     */
    @java.lang.Override
    public int getResultParam() {
      return resultParam_;
    }

    public static final int BARGAIN_RESULT_FIELD_NUMBER = 14;
    private int bargainResult_;
    /**
     * <code>.BargainResultType bargain_result = 14;</code>
     * @return The enum numeric value on the wire for bargainResult.
     */
    @java.lang.Override public int getBargainResultValue() {
      return bargainResult_;
    }
    /**
     * <code>.BargainResultType bargain_result = 14;</code>
     * @return The bargainResult.
     */
    @java.lang.Override public io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType getBargainResult() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType result = io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType.valueOf(bargainResult_);
      return result == null ? io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType.UNRECOGNIZED : result;
    }

    public static final int CUR_MOOD_FIELD_NUMBER = 6;
    private int curMood_;
    /**
     * <code>int32 cur_mood = 6;</code>
     * @return The curMood.
     */
    @java.lang.Override
    public int getCurMood() {
      return curMood_;
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
      if (retcode_ != 0) {
        output.writeInt32(5, retcode_);
      }
      if (curMood_ != 0) {
        output.writeInt32(6, curMood_);
      }
      if (resultParam_ != 0) {
        output.writeUInt32(13, resultParam_);
      }
      if (bargainResult_ != io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType.BARGAIN_RESULT_TYPE_COMPLETE_SUCC.getNumber()) {
        output.writeEnum(14, bargainResult_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, retcode_);
      }
      if (curMood_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, curMood_);
      }
      if (resultParam_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, resultParam_);
      }
      if (bargainResult_ != io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType.BARGAIN_RESULT_TYPE_COMPLETE_SUCC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(14, bargainResult_);
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
      if (!(obj instanceof io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp other = (io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getResultParam()
          != other.getResultParam()) return false;
      if (bargainResult_ != other.bargainResult_) return false;
      if (getCurMood()
          != other.getCurMood()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + RESULT_PARAM_FIELD_NUMBER;
      hash = (53 * hash) + getResultParam();
      hash = (37 * hash) + BARGAIN_RESULT_FIELD_NUMBER;
      hash = (53 * hash) + bargainResult_;
      hash = (37 * hash) + CUR_MOOD_FIELD_NUMBER;
      hash = (53 * hash) + getCurMood();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp prototype) {
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
     * CmdId: 427
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code BargainOfferPriceRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BargainOfferPriceRsp)
        io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.class, io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.newBuilder()
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
        retcode_ = 0;

        resultParam_ = 0;

        bargainResult_ = 0;

        curMood_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.BargainOfferPriceRspOuterClass.internal_static_BargainOfferPriceRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp build() {
        io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp buildPartial() {
        io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp result = new io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp(this);
        result.retcode_ = retcode_;
        result.resultParam_ = resultParam_;
        result.bargainResult_ = bargainResult_;
        result.curMood_ = curMood_;
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
        if (other instanceof io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp) {
          return mergeFrom((io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp other) {
        if (other == io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getResultParam() != 0) {
          setResultParam(other.getResultParam());
        }
        if (other.bargainResult_ != 0) {
          setBargainResultValue(other.getBargainResultValue());
        }
        if (other.getCurMood() != 0) {
          setCurMood(other.getCurMood());
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
        io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 5;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int resultParam_ ;
      /**
       * <code>uint32 result_param = 13;</code>
       * @return The resultParam.
       */
      @java.lang.Override
      public int getResultParam() {
        return resultParam_;
      }
      /**
       * <code>uint32 result_param = 13;</code>
       * @param value The resultParam to set.
       * @return This builder for chaining.
       */
      public Builder setResultParam(int value) {
        
        resultParam_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 result_param = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearResultParam() {
        
        resultParam_ = 0;
        onChanged();
        return this;
      }

      private int bargainResult_ = 0;
      /**
       * <code>.BargainResultType bargain_result = 14;</code>
       * @return The enum numeric value on the wire for bargainResult.
       */
      @java.lang.Override public int getBargainResultValue() {
        return bargainResult_;
      }
      /**
       * <code>.BargainResultType bargain_result = 14;</code>
       * @param value The enum numeric value on the wire for bargainResult to set.
       * @return This builder for chaining.
       */
      public Builder setBargainResultValue(int value) {
        
        bargainResult_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.BargainResultType bargain_result = 14;</code>
       * @return The bargainResult.
       */
      @java.lang.Override
      public io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType getBargainResult() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType result = io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType.valueOf(bargainResult_);
        return result == null ? io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType.UNRECOGNIZED : result;
      }
      /**
       * <code>.BargainResultType bargain_result = 14;</code>
       * @param value The bargainResult to set.
       * @return This builder for chaining.
       */
      public Builder setBargainResult(io.grasscutter.proto.BargainResultTypeOuterClass.BargainResultType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        bargainResult_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.BargainResultType bargain_result = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearBargainResult() {
        
        bargainResult_ = 0;
        onChanged();
        return this;
      }

      private int curMood_ ;
      /**
       * <code>int32 cur_mood = 6;</code>
       * @return The curMood.
       */
      @java.lang.Override
      public int getCurMood() {
        return curMood_;
      }
      /**
       * <code>int32 cur_mood = 6;</code>
       * @param value The curMood to set.
       * @return This builder for chaining.
       */
      public Builder setCurMood(int value) {
        
        curMood_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 cur_mood = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurMood() {
        
        curMood_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BargainOfferPriceRsp)
    }

    // @@protoc_insertion_point(class_scope:BargainOfferPriceRsp)
    private static final io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp();
    }

    public static io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BargainOfferPriceRsp>
        PARSER = new com.google.protobuf.AbstractParser<BargainOfferPriceRsp>() {
      @java.lang.Override
      public BargainOfferPriceRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BargainOfferPriceRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BargainOfferPriceRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BargainOfferPriceRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.BargainOfferPriceRspOuterClass.BargainOfferPriceRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BargainOfferPriceRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BargainOfferPriceRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032BargainOfferPriceRsp.proto\032\027BargainRes" +
      "ultType.proto\"{\n\024BargainOfferPriceRsp\022\017\n" +
      "\007retcode\030\005 \001(\005\022\024\n\014result_param\030\r \001(\r\022*\n\016" +
      "bargain_result\030\016 \001(\0162\022.BargainResultType" +
      "\022\020\n\010cur_mood\030\006 \001(\005B\026\n\024io.grasscutter.pro" +
      "tob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.BargainResultTypeOuterClass.getDescriptor(),
        });
    internal_static_BargainOfferPriceRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BargainOfferPriceRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BargainOfferPriceRsp_descriptor,
        new java.lang.String[] { "Retcode", "ResultParam", "BargainResult", "CurMood", });
    io.grasscutter.proto.BargainResultTypeOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}