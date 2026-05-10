package com.parshant.ancillary_service.repository;

import com.parshant.ancillary_service.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface MealRepository extends JpaRepository<Meal, Long>, JpaSpecificationExecutor<Meal> {

    Optional<Meal> findByCode(String code);
}
