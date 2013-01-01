package com.svashishtha.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;

public class ComputeServiceImpl implements ComputeService {
	
	private ComplexLogic logic;
    public void setLogic(ComplexLogic logic) {
      this.logic = logic;
    }

	@Override
	@WebResult(name = "computeResponse", targetNamespace = "http://svashishtha.com/ws", partName = "parameters")
	@WebMethod(action = "http://svashishtha.com/ws/compute")
	public String compute(
			@WebParam(partName = "parameters", name = "compute", targetNamespace = "http://svashishtha.com/ws") String parameters) {
		return logic.calc(parameters);
	}

}
