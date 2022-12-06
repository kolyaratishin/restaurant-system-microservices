package com.restaurant.statistics.restaurantstatisticservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RestaurantStatisticServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantStatisticServiceApplication.class, args);
	}

}
