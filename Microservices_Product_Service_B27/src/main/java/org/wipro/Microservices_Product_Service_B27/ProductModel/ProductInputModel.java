package org.wipro.Microservices_Product_Service_B27.ProductModel;


import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductInputModel implements  ResponseModel{
	
	@JsonProperty("productId")
	private Long productId;
	
	@JsonProperty("productName")
	private String productName;
	
	@JsonProperty("productPrice")
	private Long price;
	
	@JsonProperty("productCount")
	private Integer inventory;
	
	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Integer getInventory() {
		return inventory;
	}

	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}


}
