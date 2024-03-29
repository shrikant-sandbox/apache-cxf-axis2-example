package com.svashishtha.ws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

/**
 * This class was generated by Apache CXF 2.6.2 2012-12-30T12:52:39.982+08:00
 * Generated source version: 2.6.2
 * 
 */
public final class SimpleService_P1_Client {

	private static final QName SERVICE_NAME = new QName(
			"http://svashishtha.com/ws", "SimpleService");

	private SimpleService_P1_Client() {
	}

	public static void main(String args[]) throws java.lang.Exception {
		URL wsdlURL = SimpleService_Service.WSDL_LOCATION;
		if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
			File wsdlFile = new File(args[0]);
			try {
				if (wsdlFile.exists()) {
					wsdlURL = wsdlFile.toURI().toURL();
				} else {
					wsdlURL = new URL(args[0]);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}

		SimpleService_Service ss = new SimpleService_Service(wsdlURL,
				SERVICE_NAME);
		SimpleService port = ss.getP1();
		// for tcpmon to work -- start
//		BindingProvider bp = (BindingProvider) port;
//		Map<String, Object> context = bp.getRequestContext();
//		context.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
//				"http://localhost:1234/ws/p1");
		// for tcpmon to work -- end

		{
			System.out.println("Invoking concat...");
			com.svashishtha.ws.ConcatRequest _concat_parameters = new ConcatRequest();
			_concat_parameters.setS1("First Value");
			_concat_parameters.setS2("Second Value");
			java.lang.String _concat__return = port.concat(_concat_parameters);
			System.out.println("concat.result=" + _concat__return);

		}

		System.exit(0);
	}

}
