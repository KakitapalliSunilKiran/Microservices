package org.wipro.Microservices_Product_Service_B27.ProductResource;

import java.util.NoSuchElementException;

import javax.persistence.EntityNotFoundException;
import javax.persistence.NonUniqueResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.wipro.Exception.ConstructNotFoundException;
import org.wipro.Exception.ResourceAlreadyExists;
import org.wipro.Exception.ResourceDoesNotExists;
import org.wipro.Microservices_Product_Service_B27.ProductModel.Inventory;
import org.wipro.Microservices_Product_Service_B27.ProductModel.ProductInputModel;
import org.wipro.Microservices_Product_Service_B27.ProductModel.ResponseModel;

import com.netflix.discovery.EurekaClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("rest/v1/products")
@EnableDiscoveryClient
@RefreshScope
public class ProductResource {


	//@Autowired
	//RestTemplateBuilder restTemplateBuilder;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	EurekaClient eurekaClient;
	
	private final String INVENTORY_BASE_URL = "http://inventory/inventory";

	@PostMapping("addInventory")
	@HystrixCommand(fallbackMethod ="fallback" )
	public ResponseEntity<String> addInventory(@RequestBody ProductInputModel productInputModel) {
		try {
			Inventory inventory = new Inventory();
			inventory.setProductId(productInputModel.getProductId());
			inventory.setStock(String.valueOf(productInputModel.getInventory()));
			restTemplate.postForObject(INVENTORY_BASE_URL + "/create", inventory, String.class);
			
			return new ResponseEntity<String>("Created", HttpStatus.CREATED);
		} catch (EntityNotFoundException | NonUniqueResultException e) {
			return new ResponseEntity<String>("Resource Already Exists", HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("{productId}/getProduct")
	public ResponseModel getProductInputModel(@PathVariable("productId") Long productId) {
	
		try {
			ProductInputModel productInputModel = new ProductInputModel();
			productInputModel.setProductId((long)1);
			productInputModel.setProductName("PName");
			return productInputModel;
		} catch ( EntityNotFoundException | NoSuchElementException e) {
			// TODO Auto-generated catch block
			return new ConstructNotFoundException(e);
		}
	}

	
	@SuppressWarnings("rawtypes")
	public ResponseEntity<String> fallback(@RequestBody ProductInputModel productInputModel) {
		return new ResponseEntity<String>("Services are down", HttpStatus.GATEWAY_TIMEOUT);
	}


}
