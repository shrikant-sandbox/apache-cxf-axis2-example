package com.svashishtha.ws;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import javax.xml.namespace.QName;

import org.junit.Test;

public class ComputeServiceImplIntegrationTest {
	private static final QName SERVICE_NAME = new QName(
			"http://svashishtha.com/ws", "ComputeService");

	@Test
	public void testCompute() {

		URL wsdlURL = ComputeService_Service.WSDL_LOCATION;
		ComputeService_Service ss = new ComputeService_Service(wsdlURL,
				SERVICE_NAME);
		ComputeService port = ss.getP1();
		assertEquals(port.compute("xyz"), "XYZ");
	}
}