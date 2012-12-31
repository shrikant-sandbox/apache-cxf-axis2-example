package com.svashishtha.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

public class WrappedServiceImpl implements WrappedService {

	@Override
	@WebResult(name = "r", targetNamespace = "")
	@RequestWrapper(localName = "concat", targetNamespace = "http://svashishtha.com/ws", className = "com.svashishtha.ws.Concat")
	@WebMethod(action = "http://svashishtha.com/ws/NewOperation")
	@ResponseWrapper(localName = "concatResponse", targetNamespace = "http://svashishtha.com/ws", className = "com.svashishtha.ws.ConcatResponse")
	public String concat(
			@WebParam(name = "s1", targetNamespace = "") String s1,
			@WebParam(name = "s2", targetNamespace = "") String s2) {
		return s1+s2;
	}

}
