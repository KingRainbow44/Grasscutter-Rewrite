// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BlessingScanRsp.proto

package io.grasscutter.proto;

public final class BlessingScanRspOuterClass {
  private BlessingScanRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BlessingScanRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BlessingScanRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scan_pic_id = 4;</code>
     * @return The scanPicId.
     */
    int getScanPicId();

    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint32 cur_day_scan_num = 1;</code>
     * @return The curDayScanNum.
     */
    int getCurDayScanNum();
  }
  /**
   * <pre>
   * CmdId: 2093
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code BlessingScanRsp}
   */
  public static final class BlessingScanRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BlessingScanRsp)
      BlessingScanRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BlessingScanRsp.newBuilder() to construct.
    private BlessingScanRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BlessingScanRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BlessingScanRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BlessingScanRsp(
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

              curDayScanNum_ = input.readUInt32();
              break;
            }
            case 32: {

              scanPicId_ = input.readUInt32();
              break;
            }
            case 88: {

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
      return io.grasscutter.proto.BlessingScanRspOuterClass.internal_static_BlessingScanRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.BlessingScanRspOuterClass.internal_static_BlessingScanRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp.class, io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp.Builder.class);
    }

    public static final int SCAN_PIC_ID_FIELD_NUMBER = 4;
    private int scanPicId_;
    /**
     * <code>uint32 scan_pic_id = 4;</code>
     * @return The scanPicId.
     */
    @java.lang.Override
    public int getScanPicId() {
      return scanPicId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 11;
    private int retcode_;
    /**
     * <code>int32 retcode = 11;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int CUR_DAY_SCAN_NUM_FIELD_NUMBER = 1;
    private int curDayScanNum_;
    /**
     * <code>uint32 cur_day_scan_num = 1;</code>
     * @return The curDayScanNum.
     */
    @java.lang.Override
    public int getCurDayScanNum() {
      return curDayScanNum_;
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
      if (curDayScanNum_ != 0) {
        output.writeUInt32(1, curDayScanNum_);
      }
      if (scanPicId_ != 0) {
        output.writeUInt32(4, scanPicId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(11, retcode_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (curDayScanNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, curDayScanNum_);
      }
      if (scanPicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, scanPicId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(11, retcode_);
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
      if (!(obj instanceof io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp other = (io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp) obj;

      if (getScanPicId()
          != other.getScanPicId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (getCurDayScanNum()
          != other.getCurDayScanNum()) return false;
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
      hash = (37 * hash) + SCAN_PIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScanPicId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + CUR_DAY_SCAN_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getCurDayScanNum();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp prototype) {
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
     * CmdId: 2093
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code BlessingScanRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BlessingScanRsp)
        io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.BlessingScanRspOuterClass.internal_static_BlessingScanRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.BlessingScanRspOuterClass.internal_static_BlessingScanRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp.class, io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp.Builder.class);
      }

      // Construct using io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp.newBuilder()
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
        scanPicId_ = 0;

        retcode_ = 0;

        curDayScanNum_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.BlessingScanRspOuterClass.internal_static_BlessingScanRsp_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp getDefaultInstanceForType() {
        return io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp build() {
        io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp buildPartial() {
        io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp result = new io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp(this);
        result.scanPicId_ = scanPicId_;
        result.retcode_ = retcode_;
        result.curDayScanNum_ = curDayScanNum_;
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
        if (other instanceof io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp) {
          return mergeFrom((io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp other) {
        if (other == io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp.getDefaultInstance()) return this;
        if (other.getScanPicId() != 0) {
          setScanPicId(other.getScanPicId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getCurDayScanNum() != 0) {
          setCurDayScanNum(other.getCurDayScanNum());
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
        io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int scanPicId_ ;
      /**
       * <code>uint32 scan_pic_id = 4;</code>
       * @return The scanPicId.
       */
      @java.lang.Override
      public int getScanPicId() {
        return scanPicId_;
      }
      /**
       * <code>uint32 scan_pic_id = 4;</code>
       * @param value The scanPicId to set.
       * @return This builder for chaining.
       */
      public Builder setScanPicId(int value) {
        
        scanPicId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scan_pic_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearScanPicId() {
        
        scanPicId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 11;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int curDayScanNum_ ;
      /**
       * <code>uint32 cur_day_scan_num = 1;</code>
       * @return The curDayScanNum.
       */
      @java.lang.Override
      public int getCurDayScanNum() {
        return curDayScanNum_;
      }
      /**
       * <code>uint32 cur_day_scan_num = 1;</code>
       * @param value The curDayScanNum to set.
       * @return This builder for chaining.
       */
      public Builder setCurDayScanNum(int value) {
        
        curDayScanNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 cur_day_scan_num = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCurDayScanNum() {
        
        curDayScanNum_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BlessingScanRsp)
    }

    // @@protoc_insertion_point(class_scope:BlessingScanRsp)
    private static final io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp();
    }

    public static io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BlessingScanRsp>
        PARSER = new com.google.protobuf.AbstractParser<BlessingScanRsp>() {
      @java.lang.Override
      public BlessingScanRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BlessingScanRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BlessingScanRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BlessingScanRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.BlessingScanRspOuterClass.BlessingScanRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BlessingScanRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BlessingScanRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025BlessingScanRsp.proto\"Q\n\017BlessingScanR" +
      "sp\022\023\n\013scan_pic_id\030\004 \001(\r\022\017\n\007retcode\030\013 \001(\005" +
      "\022\030\n\020cur_day_scan_num\030\001 \001(\rB\026\n\024io.grasscu" +
      "tter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BlessingScanRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BlessingScanRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BlessingScanRsp_descriptor,
        new java.lang.String[] { "ScanPicId", "Retcode", "CurDayScanNum", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}