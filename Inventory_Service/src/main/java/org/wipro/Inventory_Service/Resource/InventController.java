package org.wipro.Inventory_Service.Resource;

import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;  
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wipro.Inventory_Service.Model.Inventory;

@RestController 
@RequestMapping("/inventory")
@EnableDiscoveryClient
public class InventController {
	
	//@Autowired  
	//InventoryService inventoryService; 
	
	@Value("${server.port}")
	private String port;
	
	@PostMapping("/create")
	public ResponseEntity<String> createPrice(@RequestBody Inventory inventory) {
		System.out.println("Current Port for Inventory : " + port);
	    return new ResponseEntity<String>("Entry made on "+port, HttpStatus.CREATED);
	}
	

}
