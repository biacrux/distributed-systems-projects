package pt.ipb.dsys.assessment.two;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: AnswerService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AnswerServiceGrpc {

  private AnswerServiceGrpc() {}

  public static final String SERVICE_NAME = "AnswerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.TransferNotification,
      pt.ipb.dsys.assessment.two.Void> getBankTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bankTransfer",
      requestType = pt.ipb.dsys.assessment.two.TransferNotification.class,
      responseType = pt.ipb.dsys.assessment.two.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.TransferNotification,
      pt.ipb.dsys.assessment.two.Void> getBankTransferMethod() {
    io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.TransferNotification, pt.ipb.dsys.assessment.two.Void> getBankTransferMethod;
    if ((getBankTransferMethod = AnswerServiceGrpc.getBankTransferMethod) == null) {
      synchronized (AnswerServiceGrpc.class) {
        if ((getBankTransferMethod = AnswerServiceGrpc.getBankTransferMethod) == null) {
          AnswerServiceGrpc.getBankTransferMethod = getBankTransferMethod =
              io.grpc.MethodDescriptor.<pt.ipb.dsys.assessment.two.TransferNotification, pt.ipb.dsys.assessment.two.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bankTransfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.TransferNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.Void.getDefaultInstance()))
              .setSchemaDescriptor(new AnswerServiceMethodDescriptorSupplier("bankTransfer"))
              .build();
        }
      }
    }
    return getBankTransferMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnswerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnswerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnswerServiceStub>() {
        @java.lang.Override
        public AnswerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnswerServiceStub(channel, callOptions);
        }
      };
    return AnswerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnswerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnswerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnswerServiceBlockingStub>() {
        @java.lang.Override
        public AnswerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnswerServiceBlockingStub(channel, callOptions);
        }
      };
    return AnswerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnswerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnswerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnswerServiceFutureStub>() {
        @java.lang.Override
        public AnswerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnswerServiceFutureStub(channel, callOptions);
        }
      };
    return AnswerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     **
     * Notifies the *bot* that a bank transfer finished or failed
     * </pre>
     */
    default void bankTransfer(pt.ipb.dsys.assessment.two.TransferNotification request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBankTransferMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AnswerService.
   */
  public static abstract class AnswerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AnswerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AnswerService.
   */
  public static final class AnswerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AnswerServiceStub> {
    private AnswerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnswerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnswerServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Notifies the *bot* that a bank transfer finished or failed
     * </pre>
     */
    public void bankTransfer(pt.ipb.dsys.assessment.two.TransferNotification request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBankTransferMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AnswerService.
   */
  public static final class AnswerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AnswerServiceBlockingStub> {
    private AnswerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnswerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnswerServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Notifies the *bot* that a bank transfer finished or failed
     * </pre>
     */
    public pt.ipb.dsys.assessment.two.Void bankTransfer(pt.ipb.dsys.assessment.two.TransferNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBankTransferMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AnswerService.
   */
  public static final class AnswerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AnswerServiceFutureStub> {
    private AnswerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnswerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnswerServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     **
     * Notifies the *bot* that a bank transfer finished or failed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ipb.dsys.assessment.two.Void> bankTransfer(
        pt.ipb.dsys.assessment.two.TransferNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBankTransferMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BANK_TRANSFER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BANK_TRANSFER:
          serviceImpl.bankTransfer((pt.ipb.dsys.assessment.two.TransferNotification) request,
              (io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.Void>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getBankTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pt.ipb.dsys.assessment.two.TransferNotification,
              pt.ipb.dsys.assessment.two.Void>(
                service, METHODID_BANK_TRANSFER)))
        .build();
  }

  private static abstract class AnswerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnswerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ipb.dsys.assessment.two.AnswerServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnswerService");
    }
  }

  private static final class AnswerServiceFileDescriptorSupplier
      extends AnswerServiceBaseDescriptorSupplier {
    AnswerServiceFileDescriptorSupplier() {}
  }

  private static final class AnswerServiceMethodDescriptorSupplier
      extends AnswerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnswerServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnswerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnswerServiceFileDescriptorSupplier())
              .addMethod(getBankTransferMethod())
              .build();
        }
      }
    }
    return result;
  }
}
