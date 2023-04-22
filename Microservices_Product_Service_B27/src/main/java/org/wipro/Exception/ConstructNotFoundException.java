package org.wipro.Exception;

import org.wipro.Microservices_Product_Service_B27.ProductModel.ResponseModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ConstructNotFoundException implements ResponseModel {
	
	@JsonProperty("code")
	private int code;
	
	@JsonProperty("message")
	private String message;
	
	public ConstructNotFoundException(Exception e) {
		code = 404;
		message = e.getLocalizedMessage();
	}

}
