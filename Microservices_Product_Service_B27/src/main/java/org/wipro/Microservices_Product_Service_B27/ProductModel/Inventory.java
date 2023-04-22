package org.wipro.Microservices_Product_Service_B27.ProductModel;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Inventory {
	
	@JsonProperty("productId")
	Long productId;
	
	@JsonProperty("stock")
	String stock;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public Inventory(Long productId, String stock) {
		super();
		this.productId = productId;
		this.stock = stock;
	}
	
	public Inventory() {
		
	}
	

}
