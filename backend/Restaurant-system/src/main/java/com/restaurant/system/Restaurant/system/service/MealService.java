package com.restaurant.system.Restaurant.system.service;

import com.restaurant.system.Restaurant.system.client.StatisticsClient;
import com.restaurant.system.Restaurant.system.domain.Meal;
import com.restaurant.system.Restaurant.system.dto.MealWithStatisticsDto;
import com.restaurant.system.Restaurant.system.dto.StatisticsDto;
import com.restaurant.system.Restaurant.system.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MealService {
    private final MealRepository mealRepository;
    private final StatisticsClient statisticsClient;

    public MealWithStatisticsDto getMealWithStatistics(Long mealId, Long amount){
        Meal meal = mealRepository.findById(mealId).orElseThrow();
        StatisticsDto statistics = statisticsClient.getStatistics(amount);
        return new MealWithStatisticsDto(meal, statistics);
    }
}
