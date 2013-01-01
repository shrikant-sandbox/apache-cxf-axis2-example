package ar.com.pabloExample.services;

import javax.jws.WebService;

@WebService(endpointInterface = "ar.com.pabloExample.services.HelloWorldService")
public class HelloWorldServiceBean implements HelloWorldService {

	@Override
	public String sayHello() {
		return "Hello World!!!";
	}

}
