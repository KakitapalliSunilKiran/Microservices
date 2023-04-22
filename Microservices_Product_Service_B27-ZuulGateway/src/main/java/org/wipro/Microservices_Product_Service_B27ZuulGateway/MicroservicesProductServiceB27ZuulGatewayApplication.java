package org.wipro.Microservices_Product_Service_B27ZuulGateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.wipro.Microservices_Product_Service_B27ZuulGateway.filters.ErrorFilter;
import org.wipro.Microservices_Product_Service_B27ZuulGateway.filters.PostFilter;
import org.wipro.Microservices_Product_Service_B27ZuulGateway.filters.PreFilter;
import org.wipro.Microservices_Product_Service_B27ZuulGateway.filters.RouteFilter;

@SpringBootApplication
@EnableZuulProxy
public class MicroservicesProductServiceB27ZuulGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesProductServiceB27ZuulGatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter preFilter() {
	    return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
	    return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
	    return new RouteFilter();
	}

}
