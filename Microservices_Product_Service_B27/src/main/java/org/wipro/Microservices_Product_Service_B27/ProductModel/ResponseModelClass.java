package org.wipro.Microservices_Product_Service_B27.ProductModel;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseModelClass implements ResponseModel {
	
	@JsonProperty("Code")
	int code;
	@JsonProperty("message")
	String message;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
