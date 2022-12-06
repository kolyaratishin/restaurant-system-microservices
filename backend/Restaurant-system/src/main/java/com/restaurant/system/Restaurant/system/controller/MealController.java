package com.restaurant.system.Restaurant.system.controller;

import com.restaurant.system.Restaurant.system.domain.Meal;
import com.restaurant.system.Restaurant.system.repository.MealRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meals")
@RequiredArgsConstructor
public class MealController {
    private final MealRepository mealRepository;

    @PostMapping
    public Meal create(@RequestBody Meal meal) {
        return mealRepository.save(meal);
    }
}
