package com.svashishtha.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-12-31T13:24:30.535+08:00
 * Generated source version: 2.6.2
 * 
 */
@WebService(targetNamespace = "http://svashishtha.com/ws", name = "WrappedService")
@XmlSeeAlso({ObjectFactory.class})
public interface WrappedService {

    @WebResult(name = "r", targetNamespace = "")
    @RequestWrapper(localName = "concat", targetNamespace = "http://svashishtha.com/ws", className = "com.svashishtha.ws.Concat")
    @WebMethod(action = "http://svashishtha.com/ws/NewOperation")
    @ResponseWrapper(localName = "concatResponse", targetNamespace = "http://svashishtha.com/ws", className = "com.svashishtha.ws.ConcatResponse")
    public java.lang.String concat(
        @WebParam(name = "s1", targetNamespace = "")
        java.lang.String s1,
        @WebParam(name = "s2", targetNamespace = "")
        java.lang.String s2
    );
}
