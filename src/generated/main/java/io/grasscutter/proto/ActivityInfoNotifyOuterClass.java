// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityInfoNotify.proto

package io.grasscutter.proto;

public final class ActivityInfoNotifyOuterClass {
  private ActivityInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.ActivityInfo activity_info = 9;</code>
     * @return Whether the activityInfo field is set.
     */
    boolean hasActivityInfo();
    /**
     * <code>.ActivityInfo activity_info = 9;</code>
     * @return The activityInfo.
     */
    io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo getActivityInfo();
    /**
     * <code>.ActivityInfo activity_info = 9;</code>
     */
    io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoOrBuilder();
  }
  /**
   * <pre>
   * CmdId: 2060
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code ActivityInfoNotify}
   */
  public static final class ActivityInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityInfoNotify)
      ActivityInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityInfoNotify.newBuilder() to construct.
    private ActivityInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityInfoNotify(
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
            case 74: {
              io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.Builder subBuilder = null;
              if (activityInfo_ != null) {
                subBuilder = activityInfo_.toBuilder();
              }
              activityInfo_ = input.readMessage(io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(activityInfo_);
                activityInfo_ = subBuilder.buildPartial();
              }

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
      return io.grasscutter.proto.ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.proto.ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify.class, io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify.Builder.class);
    }

    public static final int ACTIVITY_INFO_FIELD_NUMBER = 9;
    private io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo activityInfo_;
    /**
     * <code>.ActivityInfo activity_info = 9;</code>
     * @return Whether the activityInfo field is set.
     */
    @java.lang.Override
    public boolean hasActivityInfo() {
      return activityInfo_ != null;
    }
    /**
     * <code>.ActivityInfo activity_info = 9;</code>
     * @return The activityInfo.
     */
    @java.lang.Override
    public io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo getActivityInfo() {
      return activityInfo_ == null ? io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.getDefaultInstance() : activityInfo_;
    }
    /**
     * <code>.ActivityInfo activity_info = 9;</code>
     */
    @java.lang.Override
    public io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoOrBuilder() {
      return getActivityInfo();
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
      if (activityInfo_ != null) {
        output.writeMessage(9, getActivityInfo());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (activityInfo_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getActivityInfo());
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
      if (!(obj instanceof io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify)) {
        return super.equals(obj);
      }
      io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify other = (io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify) obj;

      if (hasActivityInfo() != other.hasActivityInfo()) return false;
      if (hasActivityInfo()) {
        if (!getActivityInfo()
            .equals(other.getActivityInfo())) return false;
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
      if (hasActivityInfo()) {
        hash = (37 * hash) + ACTIVITY_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getActivityInfo().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parseFrom(
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
    public static Builder newBuilder(io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify prototype) {
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
     * CmdId: 2060
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code ActivityInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityInfoNotify)
        io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.grasscutter.proto.ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.grasscutter.proto.ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify.class, io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify.Builder.class);
      }

      // Construct using io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify.newBuilder()
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
        if (activityInfoBuilder_ == null) {
          activityInfo_ = null;
        } else {
          activityInfo_ = null;
          activityInfoBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.grasscutter.proto.ActivityInfoNotifyOuterClass.internal_static_ActivityInfoNotify_descriptor;
      }

      @java.lang.Override
      public io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify getDefaultInstanceForType() {
        return io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify build() {
        io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify buildPartial() {
        io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify result = new io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify(this);
        if (activityInfoBuilder_ == null) {
          result.activityInfo_ = activityInfo_;
        } else {
          result.activityInfo_ = activityInfoBuilder_.build();
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
        if (other instanceof io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify) {
          return mergeFrom((io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify other) {
        if (other == io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify.getDefaultInstance()) return this;
        if (other.hasActivityInfo()) {
          mergeActivityInfo(other.getActivityInfo());
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
        io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo activityInfo_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo, io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.Builder, io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfoOrBuilder> activityInfoBuilder_;
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       * @return Whether the activityInfo field is set.
       */
      public boolean hasActivityInfo() {
        return activityInfoBuilder_ != null || activityInfo_ != null;
      }
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       * @return The activityInfo.
       */
      public io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo getActivityInfo() {
        if (activityInfoBuilder_ == null) {
          return activityInfo_ == null ? io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.getDefaultInstance() : activityInfo_;
        } else {
          return activityInfoBuilder_.getMessage();
        }
      }
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       */
      public Builder setActivityInfo(io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo value) {
        if (activityInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          activityInfo_ = value;
          onChanged();
        } else {
          activityInfoBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       */
      public Builder setActivityInfo(
          io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.Builder builderForValue) {
        if (activityInfoBuilder_ == null) {
          activityInfo_ = builderForValue.build();
          onChanged();
        } else {
          activityInfoBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       */
      public Builder mergeActivityInfo(io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo value) {
        if (activityInfoBuilder_ == null) {
          if (activityInfo_ != null) {
            activityInfo_ =
              io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.newBuilder(activityInfo_).mergeFrom(value).buildPartial();
          } else {
            activityInfo_ = value;
          }
          onChanged();
        } else {
          activityInfoBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       */
      public Builder clearActivityInfo() {
        if (activityInfoBuilder_ == null) {
          activityInfo_ = null;
          onChanged();
        } else {
          activityInfo_ = null;
          activityInfoBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       */
      public io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.Builder getActivityInfoBuilder() {
        
        onChanged();
        return getActivityInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       */
      public io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfoOrBuilder getActivityInfoOrBuilder() {
        if (activityInfoBuilder_ != null) {
          return activityInfoBuilder_.getMessageOrBuilder();
        } else {
          return activityInfo_ == null ?
              io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.getDefaultInstance() : activityInfo_;
        }
      }
      /**
       * <code>.ActivityInfo activity_info = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo, io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.Builder, io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfoOrBuilder> 
          getActivityInfoFieldBuilder() {
        if (activityInfoBuilder_ == null) {
          activityInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo, io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfo.Builder, io.grasscutter.proto.ActivityInfoOuterClass.ActivityInfoOrBuilder>(
                  getActivityInfo(),
                  getParentForChildren(),
                  isClean());
          activityInfo_ = null;
        }
        return activityInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ActivityInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:ActivityInfoNotify)
    private static final io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify();
    }

    public static io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<ActivityInfoNotify>() {
      @java.lang.Override
      public ActivityInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.grasscutter.proto.ActivityInfoNotifyOuterClass.ActivityInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityInfoNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030ActivityInfoNotify.proto\032\022ActivityInfo" +
      ".proto\":\n\022ActivityInfoNotify\022$\n\ractivity" +
      "_info\030\t \001(\0132\r.ActivityInfoB\026\n\024io.grasscu" +
      "tter.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.proto.ActivityInfoOuterClass.getDescriptor(),
        });
    internal_static_ActivityInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityInfoNotify_descriptor,
        new java.lang.String[] { "ActivityInfo", });
    io.grasscutter.proto.ActivityInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}