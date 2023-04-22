package org.wipro.Microservices_Product_Service_B27;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
//@EnableDiscoveryClient
public class MicroservicesProductServiceB27ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProductServiceB27ConfigServerApplication.class, args);
	}

}
