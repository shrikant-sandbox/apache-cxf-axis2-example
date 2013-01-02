package com.svashishtha.ws;

public class ComplexLogicImpl implements ComplexLogic {

	@Override
	public String calc(String parameters) {
		return parameters.toUpperCase();
	}

}
