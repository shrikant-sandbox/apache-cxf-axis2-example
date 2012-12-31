package com.ttdev.ss;

import java.rmi.RemoteException;

import com.ttdev.ss.SimpleServiceStub.ConcatRequest;
import com.ttdev.ss.SimpleServiceStub.ConcatResponse;

public class SimpleClient {
	public static void main(String[] args) throws RemoteException {
		SimpleServiceStub service = new SimpleServiceStub("http://localhost:8080/axis2/services/SimpleService");
		//for tcpmon to work
//		SimpleServiceStub service = new SimpleServiceStub("http://localhost:1234/axis2/services/SimpleService");
		ConcatRequest request = new ConcatRequest();
		request.setS1("abc");
		request.setS2("123");
		ConcatResponse response = service.concat(request);
		System.out.println(response.getConcatResponse());
	}
}