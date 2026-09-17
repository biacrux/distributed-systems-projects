package pt.ipb.dsys.assessment.two;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: BankTransferService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BankTransferServiceGrpc {

  private BankTransferServiceGrpc() {}

  public static final String SERVICE_NAME = "BankTransferService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.BankAccountList,
      pt.ipb.dsys.assessment.two.Void> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = pt.ipb.dsys.assessment.two.BankAccountList.class,
      responseType = pt.ipb.dsys.assessment.two.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.BankAccountList,
      pt.ipb.dsys.assessment.two.Void> getCreateMethod() {
    io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.BankAccountList, pt.ipb.dsys.assessment.two.Void> getCreateMethod;
    if ((getCreateMethod = BankTransferServiceGrpc.getCreateMethod) == null) {
      synchronized (BankTransferServiceGrpc.class) {
        if ((getCreateMethod = BankTransferServiceGrpc.getCreateMethod) == null) {
          BankTransferServiceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<pt.ipb.dsys.assessment.two.BankAccountList, pt.ipb.dsys.assessment.two.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.BankAccountList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.Void.getDefaultInstance()))
              .setSchemaDescriptor(new BankTransferServiceMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.TransferRequest,
      pt.ipb.dsys.assessment.two.TransferResponse> getTransferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "transfer",
      requestType = pt.ipb.dsys.assessment.two.TransferRequest.class,
      responseType = pt.ipb.dsys.assessment.two.TransferResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.TransferRequest,
      pt.ipb.dsys.assessment.two.TransferResponse> getTransferMethod() {
    io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.TransferRequest, pt.ipb.dsys.assessment.two.TransferResponse> getTransferMethod;
    if ((getTransferMethod = BankTransferServiceGrpc.getTransferMethod) == null) {
      synchronized (BankTransferServiceGrpc.class) {
        if ((getTransferMethod = BankTransferServiceGrpc.getTransferMethod) == null) {
          BankTransferServiceGrpc.getTransferMethod = getTransferMethod =
              io.grpc.MethodDescriptor.<pt.ipb.dsys.assessment.two.TransferRequest, pt.ipb.dsys.assessment.two.TransferResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "transfer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.TransferRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.TransferResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankTransferServiceMethodDescriptorSupplier("transfer"))
              .build();
        }
      }
    }
    return getTransferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.AccountBalanceRequest,
      pt.ipb.dsys.assessment.two.AccountBalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "balance",
      requestType = pt.ipb.dsys.assessment.two.AccountBalanceRequest.class,
      responseType = pt.ipb.dsys.assessment.two.AccountBalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.AccountBalanceRequest,
      pt.ipb.dsys.assessment.two.AccountBalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.AccountBalanceRequest, pt.ipb.dsys.assessment.two.AccountBalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = BankTransferServiceGrpc.getBalanceMethod) == null) {
      synchronized (BankTransferServiceGrpc.class) {
        if ((getBalanceMethod = BankTransferServiceGrpc.getBalanceMethod) == null) {
          BankTransferServiceGrpc.getBalanceMethod = getBalanceMethod =
              io.grpc.MethodDescriptor.<pt.ipb.dsys.assessment.two.AccountBalanceRequest, pt.ipb.dsys.assessment.two.AccountBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.AccountBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.AccountBalanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BankTransferServiceMethodDescriptorSupplier("balance"))
              .build();
        }
      }
    }
    return getBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.Void,
      pt.ipb.dsys.assessment.two.Void> getResetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reset",
      requestType = pt.ipb.dsys.assessment.two.Void.class,
      responseType = pt.ipb.dsys.assessment.two.Void.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.Void,
      pt.ipb.dsys.assessment.two.Void> getResetMethod() {
    io.grpc.MethodDescriptor<pt.ipb.dsys.assessment.two.Void, pt.ipb.dsys.assessment.two.Void> getResetMethod;
    if ((getResetMethod = BankTransferServiceGrpc.getResetMethod) == null) {
      synchronized (BankTransferServiceGrpc.class) {
        if ((getResetMethod = BankTransferServiceGrpc.getResetMethod) == null) {
          BankTransferServiceGrpc.getResetMethod = getResetMethod =
              io.grpc.MethodDescriptor.<pt.ipb.dsys.assessment.two.Void, pt.ipb.dsys.assessment.two.Void>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.Void.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ipb.dsys.assessment.two.Void.getDefaultInstance()))
              .setSchemaDescriptor(new BankTransferServiceMethodDescriptorSupplier("reset"))
              .build();
        }
      }
    }
    return getResetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankTransferServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankTransferServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankTransferServiceStub>() {
        @java.lang.Override
        public BankTransferServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankTransferServiceStub(channel, callOptions);
        }
      };
    return BankTransferServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankTransferServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankTransferServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankTransferServiceBlockingStub>() {
        @java.lang.Override
        public BankTransferServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankTransferServiceBlockingStub(channel, callOptions);
        }
      };
    return BankTransferServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankTransferServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BankTransferServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BankTransferServiceFutureStub>() {
        @java.lang.Override
        public BankTransferServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BankTransferServiceFutureStub(channel, callOptions);
        }
      };
    return BankTransferServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void create(pt.ipb.dsys.assessment.two.BankAccountList request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    default void transfer(pt.ipb.dsys.assessment.two.TransferRequest request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.TransferResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTransferMethod(), responseObserver);
    }

    /**
     */
    default void balance(pt.ipb.dsys.assessment.two.AccountBalanceRequest request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.AccountBalanceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    /**
     */
    default void reset(pt.ipb.dsys.assessment.two.Void request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.Void> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BankTransferService.
   */
  public static abstract class BankTransferServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BankTransferServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BankTransferService.
   */
  public static final class BankTransferServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BankTransferServiceStub> {
    private BankTransferServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankTransferServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankTransferServiceStub(channel, callOptions);
    }

    /**
     */
    public void create(pt.ipb.dsys.assessment.two.BankAccountList request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void transfer(pt.ipb.dsys.assessment.two.TransferRequest request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.TransferResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void balance(pt.ipb.dsys.assessment.two.AccountBalanceRequest request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.AccountBalanceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void reset(pt.ipb.dsys.assessment.two.Void request,
        io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.Void> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BankTransferService.
   */
  public static final class BankTransferServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BankTransferServiceBlockingStub> {
    private BankTransferServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankTransferServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankTransferServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ipb.dsys.assessment.two.Void create(pt.ipb.dsys.assessment.two.BankAccountList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ipb.dsys.assessment.two.TransferResponse transfer(pt.ipb.dsys.assessment.two.TransferRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTransferMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ipb.dsys.assessment.two.AccountBalanceResponse balance(pt.ipb.dsys.assessment.two.AccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ipb.dsys.assessment.two.Void reset(pt.ipb.dsys.assessment.two.Void request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BankTransferService.
   */
  public static final class BankTransferServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BankTransferServiceFutureStub> {
    private BankTransferServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankTransferServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BankTransferServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ipb.dsys.assessment.two.Void> create(
        pt.ipb.dsys.assessment.two.BankAccountList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ipb.dsys.assessment.two.TransferResponse> transfer(
        pt.ipb.dsys.assessment.two.TransferRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTransferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ipb.dsys.assessment.two.AccountBalanceResponse> balance(
        pt.ipb.dsys.assessment.two.AccountBalanceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ipb.dsys.assessment.two.Void> reset(
        pt.ipb.dsys.assessment.two.Void request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_TRANSFER = 1;
  private static final int METHODID_BALANCE = 2;
  private static final int METHODID_RESET = 3;

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
        case METHODID_CREATE:
          serviceImpl.create((pt.ipb.dsys.assessment.two.BankAccountList) request,
              (io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.Void>) responseObserver);
          break;
        case METHODID_TRANSFER:
          serviceImpl.transfer((pt.ipb.dsys.assessment.two.TransferRequest) request,
              (io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.TransferResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((pt.ipb.dsys.assessment.two.AccountBalanceRequest) request,
              (io.grpc.stub.StreamObserver<pt.ipb.dsys.assessment.two.AccountBalanceResponse>) responseObserver);
          break;
        case METHODID_RESET:
          serviceImpl.reset((pt.ipb.dsys.assessment.two.Void) request,
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
          getCreateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pt.ipb.dsys.assessment.two.BankAccountList,
              pt.ipb.dsys.assessment.two.Void>(
                service, METHODID_CREATE)))
        .addMethod(
          getTransferMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pt.ipb.dsys.assessment.two.TransferRequest,
              pt.ipb.dsys.assessment.two.TransferResponse>(
                service, METHODID_TRANSFER)))
        .addMethod(
          getBalanceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pt.ipb.dsys.assessment.two.AccountBalanceRequest,
              pt.ipb.dsys.assessment.two.AccountBalanceResponse>(
                service, METHODID_BALANCE)))
        .addMethod(
          getResetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              pt.ipb.dsys.assessment.two.Void,
              pt.ipb.dsys.assessment.two.Void>(
                service, METHODID_RESET)))
        .build();
  }

  private static abstract class BankTransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BankTransferServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ipb.dsys.assessment.two.BankTransferServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BankTransferService");
    }
  }

  private static final class BankTransferServiceFileDescriptorSupplier
      extends BankTransferServiceBaseDescriptorSupplier {
    BankTransferServiceFileDescriptorSupplier() {}
  }

  private static final class BankTransferServiceMethodDescriptorSupplier
      extends BankTransferServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BankTransferServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BankTransferServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BankTransferServiceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getTransferMethod())
              .addMethod(getBalanceMethod())
              .addMethod(getResetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
