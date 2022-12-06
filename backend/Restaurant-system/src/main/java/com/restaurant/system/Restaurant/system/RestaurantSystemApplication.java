package com.restaurant.system.Restaurant.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class RestaurantSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantSystemApplication.class, args);
	}

}
