// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: job_worker_service.proto

package com.zhd.grpc.job.service;

public interface RegisterWorkerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.zhd.grpc.service.RegisterWorkerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.zhd.grpc.service.WorkerAbility ability = 1;</code>
   * @return Whether the ability field is set.
   */
  boolean hasAbility();
  /**
   * <code>.com.zhd.grpc.service.WorkerAbility ability = 1;</code>
   * @return The ability.
   */
  com.zhd.grpc.job.service.WorkerAbility getAbility();
  /**
   * <code>.com.zhd.grpc.service.WorkerAbility ability = 1;</code>
   */
  com.zhd.grpc.job.service.WorkerAbilityOrBuilder getAbilityOrBuilder();
}
