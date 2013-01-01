package com.svashishtha.service.img;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.6.2
 * 2012-12-31T15:32:34.736+08:00
 * Generated source version: 2.6.2
 * 
 */
@WebServiceClient(name = "ImageService", 
                  wsdlLocation = "file:src/main/resources/ImageService.wsdl",
                  targetNamespace = "urn:svashishtha.com:service/img") 
public class ImageService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:svashishtha.com:service/img", "ImageService");
    public final static QName P1 = new QName("urn:svashishtha.com:service/img", "p1");
    static {
        URL url = null;
        try {
            url = new URL("file:src/main/resources/ImageService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ImageService_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:src/main/resources/ImageService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ImageService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ImageService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ImageService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ImageService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ImageService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ImageService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns ImageService
     */
    @WebEndpoint(name = "p1")
    public ImageService getP1() {
        return super.getPort(P1, ImageService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ImageService
     */
    @WebEndpoint(name = "p1")
    public ImageService getP1(WebServiceFeature... features) {
        return super.getPort(P1, ImageService.class, features);
    }

}
