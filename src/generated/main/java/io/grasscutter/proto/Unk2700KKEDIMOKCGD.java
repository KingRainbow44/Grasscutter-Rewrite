// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_KKEDIMOKCGD.proto

package io.grasscutter.proto;

public final class Unk2700KKEDIMOKCGD {
  private Unk2700KKEDIMOKCGD() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_KKEDIMOKCGDOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_KKEDIMOKCGD)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Unk2700_NHBDAFBHNMH = 9;</code>
     * @return The unk2700NHBDAFBHNMH.
     */
    boolean getUnk2700NHBDAFBHNMH();

    /**
     * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
     * @return The enum numeric value on the wire for unk2700KEAGHCIIGGN.
     */
    int getUnk2700KEAGHCIIGGNValue();
    /**
     * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
     * @return The unk2700KEAGHCIIGGN.
     */
    io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM getUnk2700KEAGHCIIGGN();
  }
  /**
   * <pre>
   * CmdId: 8218
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_KKEDIMOKCGD}
   */
  public static final class Unk2700_KKEDIMOKCGD extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_KKEDIMOKCGD)
      Unk2700_KKEDIMOKCGDOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_KKEDIMOKCGD.newBuilder() to construct.
    private Unk2700_KKEDIMOKCGD(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_KKEDIMOKCGD() {
      unk2700KEAGHCIIGGN_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_KKEDIMOKCGD();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_KKEDIMOKCGD(
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
            case 72: {

              unk2700NHBDAFBHNMH_ = input.readBool();
              break;
            }
            case 80: {
              int rawValue = input.readEnum();

              unk2700KEAGHCIIGGN_ = rawValue;
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
      return io.grasscutter.proto.Unk2700KKEDIMOKCGD.internal_static_Unk2700_KKEDIMOKCGD_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.Unk2700KKEDIMOKCGD.internal_static_Unk2700_KKEDIMOKCGD_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD.class, io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD.Builder.class);
    }

    public static final int UNK2700_NHBDAFBHNMH_FIELD_NUMBER = 9;
    private boolean unk2700NHBDAFBHNMH_;
    /**
     * <code>bool Unk2700_NHBDAFBHNMH = 9;</code>
     * @return The unk2700NHBDAFBHNMH.
     */
    @java.lang.Override
    public boolean getUnk2700NHBDAFBHNMH() {
      return unk2700NHBDAFBHNMH_;
    }

    public static final int UNK2700_KEAGHCIIGGN_FIELD_NUMBER = 10;
    private int unk2700KEAGHCIIGGN_;
    /**
     * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
     * @return The enum numeric value on the wire for unk2700KEAGHCIIGGN.
     */
    @java.lang.Override public int getUnk2700KEAGHCIIGGNValue() {
      return unk2700KEAGHCIIGGN_;
    }
    /**
     * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
     * @return The unk2700KEAGHCIIGGN.
     */
    @java.lang.Override public io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM getUnk2700KEAGHCIIGGN() {
      @SuppressWarnings("deprecation")
      io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM result = io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM.valueOf(unk2700KEAGHCIIGGN_);
      return result == null ? io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM.UNRECOGNIZED : result;
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
      if (unk2700NHBDAFBHNMH_ != false) {
        output.writeBool(9, unk2700NHBDAFBHNMH_);
      }
      if (unk2700KEAGHCIIGGN_ != io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM.Unk2700_EEPNCOAEKBM_Unk2700_EAFEANPNJLO.getNumber()) {
        output.writeEnum(10, unk2700KEAGHCIIGGN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700NHBDAFBHNMH_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, unk2700NHBDAFBHNMH_);
      }
      if (unk2700KEAGHCIIGGN_ != io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM.Unk2700_EEPNCOAEKBM_Unk2700_EAFEANPNJLO.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(10, unk2700KEAGHCIIGGN_);
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
      if (!(obj instanceof io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD other = (io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD) obj;

      if (getUnk2700NHBDAFBHNMH()
          != other.getUnk2700NHBDAFBHNMH()) return false;
      if (unk2700KEAGHCIIGGN_ != other.unk2700KEAGHCIIGGN_) return false;
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
      hash = (37 * hash) + UNK2700_NHBDAFBHNMH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getUnk2700NHBDAFBHNMH());
      hash = (37 * hash) + UNK2700_KEAGHCIIGGN_FIELD_NUMBER;
      hash = (53 * hash) + unk2700KEAGHCIIGGN_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD prototype) {
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
     * CmdId: 8218
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_KKEDIMOKCGD}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_KKEDIMOKCGD)
        io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGDOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.Unk2700KKEDIMOKCGD.internal_static_Unk2700_KKEDIMOKCGD_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.Unk2700KKEDIMOKCGD.internal_static_Unk2700_KKEDIMOKCGD_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD.class, io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD.Builder.class);
      }

      // Construct using io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD.newBuilder()
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
        unk2700NHBDAFBHNMH_ = false;

        unk2700KEAGHCIIGGN_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.Unk2700KKEDIMOKCGD.internal_static_Unk2700_KKEDIMOKCGD_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD getDefaultInstanceForType() {
        return io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD build() {
        io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD buildPartial() {
        io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD result = new io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD(this);
        result.unk2700NHBDAFBHNMH_ = unk2700NHBDAFBHNMH_;
        result.unk2700KEAGHCIIGGN_ = unk2700KEAGHCIIGGN_;
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
        if (other instanceof io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD) {
          return mergeFrom((io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD other) {
        if (other == io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD.getDefaultInstance()) return this;
        if (other.getUnk2700NHBDAFBHNMH() != false) {
          setUnk2700NHBDAFBHNMH(other.getUnk2700NHBDAFBHNMH());
        }
        if (other.unk2700KEAGHCIIGGN_ != 0) {
          setUnk2700KEAGHCIIGGNValue(other.getUnk2700KEAGHCIIGGNValue());
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
        io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean unk2700NHBDAFBHNMH_ ;
      /**
       * <code>bool Unk2700_NHBDAFBHNMH = 9;</code>
       * @return The unk2700NHBDAFBHNMH.
       */
      @java.lang.Override
      public boolean getUnk2700NHBDAFBHNMH() {
        return unk2700NHBDAFBHNMH_;
      }
      /**
       * <code>bool Unk2700_NHBDAFBHNMH = 9;</code>
       * @param value The unk2700NHBDAFBHNMH to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700NHBDAFBHNMH(boolean value) {
        
        unk2700NHBDAFBHNMH_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Unk2700_NHBDAFBHNMH = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700NHBDAFBHNMH() {
        
        unk2700NHBDAFBHNMH_ = false;
        onChanged();
        return this;
      }

      private int unk2700KEAGHCIIGGN_ = 0;
      /**
       * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
       * @return The enum numeric value on the wire for unk2700KEAGHCIIGGN.
       */
      @java.lang.Override public int getUnk2700KEAGHCIIGGNValue() {
        return unk2700KEAGHCIIGGN_;
      }
      /**
       * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
       * @param value The enum numeric value on the wire for unk2700KEAGHCIIGGN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KEAGHCIIGGNValue(int value) {
        
        unk2700KEAGHCIIGGN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
       * @return The unk2700KEAGHCIIGGN.
       */
      @java.lang.Override
      public io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM getUnk2700KEAGHCIIGGN() {
        @SuppressWarnings("deprecation")
        io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM result = io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM.valueOf(unk2700KEAGHCIIGGN_);
        return result == null ? io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM.UNRECOGNIZED : result;
      }
      /**
       * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
       * @param value The unk2700KEAGHCIIGGN to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700KEAGHCIIGGN(io.grasscutter.proto.Unk2700EEPNCOAEKBM.Unk2700_EEPNCOAEKBM value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unk2700KEAGHCIIGGN_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.Unk2700_EEPNCOAEKBM Unk2700_KEAGHCIIGGN = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700KEAGHCIIGGN() {
        
        unk2700KEAGHCIIGGN_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_KKEDIMOKCGD)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_KKEDIMOKCGD)
    private static final io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD();
    }

    public static io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_KKEDIMOKCGD>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_KKEDIMOKCGD>() {
      @java.lang.Override
      public Unk2700_KKEDIMOKCGD parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_KKEDIMOKCGD(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_KKEDIMOKCGD> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_KKEDIMOKCGD> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.Unk2700KKEDIMOKCGD.Unk2700_KKEDIMOKCGD getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_KKEDIMOKCGD_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_KKEDIMOKCGD_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031Unk2700_KKEDIMOKCGD.proto\032\031Unk2700_EEP" +
      "NCOAEKBM.proto\"e\n\023Unk2700_KKEDIMOKCGD\022\033\n" +
      "\023Unk2700_NHBDAFBHNMH\030\t \001(\010\0221\n\023Unk2700_KE" +
      "AGHCIIGGN\030\n \001(\0162\024.Unk2700_EEPNCOAEKBMB\026\n" +
      "\024io.grasscutter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.Unk2700EEPNCOAEKBM.getDescriptor(),
        });
    internal_static_Unk2700_KKEDIMOKCGD_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_KKEDIMOKCGD_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_KKEDIMOKCGD_descriptor,
        new java.lang.String[] { "Unk2700NHBDAFBHNMH", "Unk2700KEAGHCIIGGN", });
    io.grasscutter.proto.Unk2700EEPNCOAEKBM.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}