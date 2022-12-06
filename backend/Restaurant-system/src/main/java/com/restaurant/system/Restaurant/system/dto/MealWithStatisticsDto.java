package com.restaurant.system.Restaurant.system.dto;

import com.restaurant.system.Restaurant.system.domain.Meal;

public record MealWithStatisticsDto(Meal meal, StatisticsDto statisticsDto) {
}
