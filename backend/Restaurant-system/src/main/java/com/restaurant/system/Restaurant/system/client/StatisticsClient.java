package com.restaurant.system.Restaurant.system.client;

import com.restaurant.system.Restaurant.system.dto.StatisticsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "restaurant-statistics", url = "http://localhost:8082/statistics")
public interface StatisticsClient {

    @GetMapping
    StatisticsDto getStatistics(@RequestParam("amount") Long amount);


}
