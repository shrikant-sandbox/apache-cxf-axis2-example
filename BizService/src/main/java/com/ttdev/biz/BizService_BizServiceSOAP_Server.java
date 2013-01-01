
package com.ttdev.biz;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-12-31T14:57:20.583+08:00
 * Generated source version: 2.6.2
 * 
 */
 
public class BizService_BizServiceSOAP_Server{

    protected BizService_BizServiceSOAP_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new BizServiceImpl();
        String address = "http://localhost:8080/ws/p1";
        Endpoint.publish(address, implementor);
    }
    
    public static void main(String args[]) throws java.lang.Exception { 
        new BizService_BizServiceSOAP_Server();
        System.out.println("Server ready..."); 
        
        Thread.sleep(5 * 60 * 1000); 
        System.out.println("Server exiting");
        System.exit(0);
    }
}
