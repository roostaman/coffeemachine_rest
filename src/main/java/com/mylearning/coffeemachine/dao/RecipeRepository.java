package com.mylearning.coffeemachine.dao;

import com.mylearning.coffeemachine.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
