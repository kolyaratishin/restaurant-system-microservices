package com.restaurant.system.Restaurant.system.controller;

import com.restaurant.system.Restaurant.system.domain.Meal;
import com.restaurant.system.Restaurant.system.dto.MealWithStatisticsDto;
import com.restaurant.system.Restaurant.system.repository.MealRepository;
import com.restaurant.system.Restaurant.system.service.MealService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meals")
@RequiredArgsConstructor
public class MealController {
    private final MealRepository mealRepository;

    private final MealService mealService;

    @PostMapping
    public Meal create(@RequestBody Meal meal) {
        return mealRepository.save(meal);
    }

    @GetMapping("/{mealId}")
    public MealWithStatisticsDto getMealWithStatistics(@PathVariable Long mealId,@RequestParam Long amount) {
        return mealService.getMealWithStatistics(mealId, amount);
    }
}
