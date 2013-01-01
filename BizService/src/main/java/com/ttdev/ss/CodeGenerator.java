package com.ttdev.ss;

import org.apache.cxf.tools.wsdlto.WSDLToJava;

public class CodeGenerator {

	public static void main(String[] args) {
		WSDLToJava.main(new String[] { "-server", "-p",
				"http://svashishtha.com/ws=com.ttdev.biz", "-d", "src/main/java",
				"src/main/resources/BizService.wsdl" });
	}
}
