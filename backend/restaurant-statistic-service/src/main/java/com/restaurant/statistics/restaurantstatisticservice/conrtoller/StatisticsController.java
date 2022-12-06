package com.restaurant.statistics.restaurantstatisticservice.conrtoller;

import com.restaurant.statistics.restaurantstatisticservice.domain.Statistics;
import com.restaurant.statistics.restaurantstatisticservice.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/statistics")
@RequiredArgsConstructor
public class StatisticsController {
    private final StatisticsService statisticsService;

    @GetMapping
    public Statistics getStatistics(@RequestParam("amount") Long amount){
        return statisticsService.makeStatistics(amount);
    }
}
