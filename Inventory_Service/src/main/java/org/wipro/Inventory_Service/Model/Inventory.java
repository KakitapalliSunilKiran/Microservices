package org.wipro.Inventory_Service.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Inventory")
@Getter
@Setter
public class Inventory {
	
	@Id
	@Column(name = "productId")
	@JsonProperty("productId")
	Long productId;
	
	@Column(name = "stock")
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
