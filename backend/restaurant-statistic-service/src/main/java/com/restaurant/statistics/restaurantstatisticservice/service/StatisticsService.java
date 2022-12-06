package com.restaurant.statistics.restaurantstatisticservice.service;

import com.restaurant.statistics.restaurantstatisticservice.domain.Statistics;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StatisticsService {

    public Statistics makeStatistics(Long amount) {
        return new Statistics(UUID.randomUUID().toString(), amount);
    }
}
