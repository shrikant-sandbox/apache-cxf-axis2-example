package com.svashishtha.ws;

import static org.junit.Assert.assertEquals;

import javax.xml.ws.BindingProvider;

import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBusFactory;
import org.apache.cxf.transport.ConduitInitiatorManager;
import org.apache.cxf.transport.local.LocalTransportFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = { "classpath:beans.xml",
		"classpath:beans-test.xml" })
public class ComputeServiceImplTest extends AbstractJUnit4SpringContextTests {
	private Bus bus;

	@Before
	public void setup() {
		bus = new SpringBusFactory(applicationContext).createBus();
		setupLocalTransport();
	}

	@After
	public void tearDown() throws Exception {
		bus.shutdown(false);

	}

	@Test
	public void testCompute() {
		ComputeServiceImpl impl = (ComputeServiceImpl) applicationContext
				.getBean("serviceImpl");

		impl.setLogic(new ComplexLogic() {

			@Override
			public String calc(String parameters) {
				return parameters.toUpperCase();
			}

		});

		ComputeService_Service ss = new ComputeService_Service();
		ComputeService port = ss.getP1();
		setAddress(port, "local://ep1");
		assertEquals(port.compute("xyz"), "XYZ");
	}

	private void setAddress(ComputeService port, String addr) {
		BindingProvider bp = (BindingProvider) port;
		bp.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY,
				addr);
	}

	private void setupLocalTransport() {
		LocalTransportFactory localTransportFactory = (LocalTransportFactory) applicationContext
				.getBean("localTransportFactory");
		ConduitInitiatorManager cim = bus
				.getExtension(ConduitInitiatorManager.class);
		cim.registerConduitInitiator("http://cxf.apache.org/transports/local",
				localTransportFactory);
		cim.registerConduitInitiator(
				"http://schemas.xmlsoap.org/wsdl/soap/http",
				localTransportFactory);
		cim.registerConduitInitiator("http://schemas.xmlsoap.org/soap/http",
				localTransportFactory);
		cim.registerConduitInitiator("http://cxf.apache.org/bindings/xformat",
				localTransportFactory);
	}
}
