package com.svashishtha.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2013-01-01T08:38:56.476+08:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "ComputeService", 
                  wsdlLocation = "src/main/resources/ComputeService.wsdl",
                  targetNamespace = "http://svashishtha.com/ws") 
public class ComputeService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://svashishtha.com/ws", "ComputeService");
    public final static QName P1 = new QName("http://svashishtha.com/ws", "p1");
    static {
        URL url = null;
		try {
			url = new URL("file:src/main/resources/ComputeService.wsdl");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        if (url == null) {
            java.util.logging.Logger.getLogger(ComputeService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "src/main/resources/ComputeService.wsdl");
        }       
        WSDL_LOCATION = url;
    }

    public ComputeService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ComputeService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ComputeService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ComputeService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ComputeService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ComputeService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ComputeService
     */
    @WebEndpoint(name = "p1")
    public ComputeService getP1() {
        return super.getPort(P1, ComputeService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ComputeService
     */
    @WebEndpoint(name = "p1")
    public ComputeService getP1(WebServiceFeature... features) {
        return super.getPort(P1, ComputeService.class, features);
    }

}
