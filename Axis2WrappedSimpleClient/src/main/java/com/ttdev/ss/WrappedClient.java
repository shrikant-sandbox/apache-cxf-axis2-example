package com.ttdev.ss;

import java.rmi.RemoteException;


public class WrappedClient {
	public static void main(String[] args) throws RemoteException {
		WrappedServiceStub service = new WrappedServiceStub("http://localhost:8080/axis2/services/WrappedService");
		//for tcpmon to work
//		WrappedServiceStub service = new WrappedServiceStub("http://localhost:1234/axis2/services/WrappedService");
		
		System.out.println(service.concat("First value", "Second value"));
	}
}