package org.wipro.Microservices_Product_Service_B27;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroservicesProductServiceB27EurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProductServiceB27EurekaServerApplication.class, args);
	}

}
