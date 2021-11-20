// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_worker_service.proto

package com.zhd.grpc.job.service;

/**
 * Protobuf type {@code com.zhd.grpc.service.RegisterWorkerReply}
 */
public final class RegisterWorkerReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.zhd.grpc.service.RegisterWorkerReply)
    RegisterWorkerReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegisterWorkerReply.newBuilder() to construct.
  private RegisterWorkerReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegisterWorkerReply() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegisterWorkerReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegisterWorkerReply(
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
          case 10: {
            com.zhd.grpc.job.service.ErrorCode.Builder subBuilder = null;
            if (errCode_ != null) {
              subBuilder = errCode_.toBuilder();
            }
            errCode_ = input.readMessage(com.zhd.grpc.job.service.ErrorCode.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(errCode_);
              errCode_ = subBuilder.buildPartial();
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
    return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_RegisterWorkerReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_RegisterWorkerReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.zhd.grpc.job.service.RegisterWorkerReply.class, com.zhd.grpc.job.service.RegisterWorkerReply.Builder.class);
  }

  public static final int ERR_CODE_FIELD_NUMBER = 1;
  private com.zhd.grpc.job.service.ErrorCode errCode_;
  /**
   * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
   * @return Whether the errCode field is set.
   */
  @java.lang.Override
  public boolean hasErrCode() {
    return errCode_ != null;
  }
  /**
   * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
   * @return The errCode.
   */
  @java.lang.Override
  public com.zhd.grpc.job.service.ErrorCode getErrCode() {
    return errCode_ == null ? com.zhd.grpc.job.service.ErrorCode.getDefaultInstance() : errCode_;
  }
  /**
   * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
   */
  @java.lang.Override
  public com.zhd.grpc.job.service.ErrorCodeOrBuilder getErrCodeOrBuilder() {
    return getErrCode();
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
    if (errCode_ != null) {
      output.writeMessage(1, getErrCode());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (errCode_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getErrCode());
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
    if (!(obj instanceof com.zhd.grpc.job.service.RegisterWorkerReply)) {
      return super.equals(obj);
    }
    com.zhd.grpc.job.service.RegisterWorkerReply other = (com.zhd.grpc.job.service.RegisterWorkerReply) obj;

    if (hasErrCode() != other.hasErrCode()) return false;
    if (hasErrCode()) {
      if (!getErrCode()
          .equals(other.getErrCode())) return false;
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
    if (hasErrCode()) {
      hash = (37 * hash) + ERR_CODE_FIELD_NUMBER;
      hash = (53 * hash) + getErrCode().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.zhd.grpc.job.service.RegisterWorkerReply parseFrom(
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
  public static Builder newBuilder(com.zhd.grpc.job.service.RegisterWorkerReply prototype) {
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
   * Protobuf type {@code com.zhd.grpc.service.RegisterWorkerReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.zhd.grpc.service.RegisterWorkerReply)
      com.zhd.grpc.job.service.RegisterWorkerReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_RegisterWorkerReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_RegisterWorkerReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zhd.grpc.job.service.RegisterWorkerReply.class, com.zhd.grpc.job.service.RegisterWorkerReply.Builder.class);
    }

    // Construct using com.zhd.grpc.job.service.RegisterWorkerReply.newBuilder()
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
      if (errCodeBuilder_ == null) {
        errCode_ = null;
      } else {
        errCode_ = null;
        errCodeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.zhd.grpc.job.service.JobServiceProto.internal_static_com_zhd_grpc_service_RegisterWorkerReply_descriptor;
    }

    @java.lang.Override
    public com.zhd.grpc.job.service.RegisterWorkerReply getDefaultInstanceForType() {
      return com.zhd.grpc.job.service.RegisterWorkerReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.zhd.grpc.job.service.RegisterWorkerReply build() {
      com.zhd.grpc.job.service.RegisterWorkerReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.zhd.grpc.job.service.RegisterWorkerReply buildPartial() {
      com.zhd.grpc.job.service.RegisterWorkerReply result = new com.zhd.grpc.job.service.RegisterWorkerReply(this);
      if (errCodeBuilder_ == null) {
        result.errCode_ = errCode_;
      } else {
        result.errCode_ = errCodeBuilder_.build();
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
      if (other instanceof com.zhd.grpc.job.service.RegisterWorkerReply) {
        return mergeFrom((com.zhd.grpc.job.service.RegisterWorkerReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.zhd.grpc.job.service.RegisterWorkerReply other) {
      if (other == com.zhd.grpc.job.service.RegisterWorkerReply.getDefaultInstance()) return this;
      if (other.hasErrCode()) {
        mergeErrCode(other.getErrCode());
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
      com.zhd.grpc.job.service.RegisterWorkerReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.zhd.grpc.job.service.RegisterWorkerReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.zhd.grpc.job.service.ErrorCode errCode_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zhd.grpc.job.service.ErrorCode, com.zhd.grpc.job.service.ErrorCode.Builder, com.zhd.grpc.job.service.ErrorCodeOrBuilder> errCodeBuilder_;
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     * @return Whether the errCode field is set.
     */
    public boolean hasErrCode() {
      return errCodeBuilder_ != null || errCode_ != null;
    }
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     * @return The errCode.
     */
    public com.zhd.grpc.job.service.ErrorCode getErrCode() {
      if (errCodeBuilder_ == null) {
        return errCode_ == null ? com.zhd.grpc.job.service.ErrorCode.getDefaultInstance() : errCode_;
      } else {
        return errCodeBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     */
    public Builder setErrCode(com.zhd.grpc.job.service.ErrorCode value) {
      if (errCodeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        errCode_ = value;
        onChanged();
      } else {
        errCodeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     */
    public Builder setErrCode(
        com.zhd.grpc.job.service.ErrorCode.Builder builderForValue) {
      if (errCodeBuilder_ == null) {
        errCode_ = builderForValue.build();
        onChanged();
      } else {
        errCodeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     */
    public Builder mergeErrCode(com.zhd.grpc.job.service.ErrorCode value) {
      if (errCodeBuilder_ == null) {
        if (errCode_ != null) {
          errCode_ =
            com.zhd.grpc.job.service.ErrorCode.newBuilder(errCode_).mergeFrom(value).buildPartial();
        } else {
          errCode_ = value;
        }
        onChanged();
      } else {
        errCodeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     */
    public Builder clearErrCode() {
      if (errCodeBuilder_ == null) {
        errCode_ = null;
        onChanged();
      } else {
        errCode_ = null;
        errCodeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     */
    public com.zhd.grpc.job.service.ErrorCode.Builder getErrCodeBuilder() {
      
      onChanged();
      return getErrCodeFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     */
    public com.zhd.grpc.job.service.ErrorCodeOrBuilder getErrCodeOrBuilder() {
      if (errCodeBuilder_ != null) {
        return errCodeBuilder_.getMessageOrBuilder();
      } else {
        return errCode_ == null ?
            com.zhd.grpc.job.service.ErrorCode.getDefaultInstance() : errCode_;
      }
    }
    /**
     * <code>.com.zhd.grpc.service.ErrorCode err_code = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.zhd.grpc.job.service.ErrorCode, com.zhd.grpc.job.service.ErrorCode.Builder, com.zhd.grpc.job.service.ErrorCodeOrBuilder> 
        getErrCodeFieldBuilder() {
      if (errCodeBuilder_ == null) {
        errCodeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.zhd.grpc.job.service.ErrorCode, com.zhd.grpc.job.service.ErrorCode.Builder, com.zhd.grpc.job.service.ErrorCodeOrBuilder>(
                getErrCode(),
                getParentForChildren(),
                isClean());
        errCode_ = null;
      }
      return errCodeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.zhd.grpc.service.RegisterWorkerReply)
  }

  // @@protoc_insertion_point(class_scope:com.zhd.grpc.service.RegisterWorkerReply)
  private static final com.zhd.grpc.job.service.RegisterWorkerReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.zhd.grpc.job.service.RegisterWorkerReply();
  }

  public static com.zhd.grpc.job.service.RegisterWorkerReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegisterWorkerReply>
      PARSER = new com.google.protobuf.AbstractParser<RegisterWorkerReply>() {
    @java.lang.Override
    public RegisterWorkerReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegisterWorkerReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegisterWorkerReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegisterWorkerReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.zhd.grpc.job.service.RegisterWorkerReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

