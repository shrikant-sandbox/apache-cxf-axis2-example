package com.ttdev.ss;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {

	public static void main(String[] args) {
		WSDLToJava.main(new String[] { "-server", "-d", "src/main/java",
				"src/main/resources/ImageService.wsdl" });
	}
}
