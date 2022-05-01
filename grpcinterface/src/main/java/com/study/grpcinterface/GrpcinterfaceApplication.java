package com.study.grpcinterface;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import proto.grpc.KJJHelloSVCGrpc;

@SpringBootApplication
public class GrpcinterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GrpcinterfaceApplication.class, args);
	}

	public class svc extends KJJHelloSVCGrpc.KJJHelloSVCImplBase {

	}
}
