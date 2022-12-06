package com.restaurant.system.Restaurant.system.repository;

import com.restaurant.system.Restaurant.system.domain.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealRepository extends JpaRepository<Meal, Long> {
}
