// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job.proto

package com.zhd.grpc.job;

public interface GetJobResultReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.zhd.grpc.job.GetJobResultReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.zhd.grpc.job.ErrorCode err_code = 1;</code>
   * @return Whether the errCode field is set.
   */
  boolean hasErrCode();
  /**
   * <code>.com.zhd.grpc.job.ErrorCode err_code = 1;</code>
   * @return The errCode.
   */
  com.zhd.grpc.job.ErrorCode getErrCode();
  /**
   * <code>.com.zhd.grpc.job.ErrorCode err_code = 1;</code>
   */
  com.zhd.grpc.job.ErrorCodeOrBuilder getErrCodeOrBuilder();

  /**
   * <code>.com.zhd.grpc.job.JobResult result = 2;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <code>.com.zhd.grpc.job.JobResult result = 2;</code>
   * @return The result.
   */
  com.zhd.grpc.job.JobResult getResult();
  /**
   * <code>.com.zhd.grpc.job.JobResult result = 2;</code>
   */
  com.zhd.grpc.job.JobResultOrBuilder getResultOrBuilder();
}
