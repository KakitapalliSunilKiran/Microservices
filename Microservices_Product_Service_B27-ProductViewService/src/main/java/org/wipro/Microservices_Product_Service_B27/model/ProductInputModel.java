package org.wipro.Microservices_Product_Service_B27.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductInputModel implements ResponseModel{

	@JsonProperty("productId")
	private Long productId;
	
	@JsonProperty("productName")
	private String productName;
	
	@JsonProperty("productPrice")
	private Long price;
	
	@JsonProperty("productCount")
	private Integer inventory;
	
	@JsonProperty("category")
	private String category;
	
	@JsonProperty("percentage")
	private Long percentage;
	
	@JsonProperty("promoID")
	private Long promoId;

	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category1) {
		category = category1;
	}

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

	public ProductInputModel(Long productId, String productName, Long price, Integer inventory, String category,
			Long percentage, Long promoId) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.inventory = inventory;
		this.category = category;
		this.percentage = percentage;
		this.promoId = promoId;
	}

	public ProductInputModel() {
		
	}
	
	
}
