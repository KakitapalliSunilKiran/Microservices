package org.wipro.Microservices_Product_Service_B27.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.wipro.Microservices_Product_Service_B27.model.ProductInputModel;
import org.wipro.Microservices_Product_Service_B27.model.ResponseModel;

@RestController
@RefreshScope
public class ProductViewController {
	
	@Autowired
	RestTemplate restTemplate;
	
	private final String BASE_URL = "http://product-service/rest/v1/products";
	
	@Value("${message : Hello from config}")
	private String message;
	
	@Value("${user.role : Hello user from config}")
	private String role;
	
	@GetMapping("/message")
	public String welcomePageMessage() {
		return message;
	}
	
	@GetMapping("/role")
	public String welcomePageRole() {
		return role;
	}
	
	@GetMapping("/products/{productId}")
	public ResponseModel getProductDetail(@PathVariable("productId") Long productId) {
		return restTemplate.getForObject(BASE_URL + "/" + String.valueOf(productId) + "/getProduct", ProductInputModel.class);
	}
	
	@PostMapping("/createInventory")
	public ResponseEntity<String> getInventoryDetail() {
		ProductInputModel productInputModel = new ProductInputModel();
		productInputModel.setProductId((long)1);
		productInputModel.setPrice((long)100);
		productInputModel.setInventory(100);
		restTemplate.postForObject(BASE_URL + "/addInventory", productInputModel, String.class);
		return new ResponseEntity<>("Created", HttpStatus.CREATED);
	}
	
}
