package com.mylearning.coffeemachine.service;

import com.mylearning.coffeemachine.dao.RecipeRepository;
import com.mylearning.coffeemachine.entity.Recipe;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import com.mylearning.coffeemachine.dto.RecipeDTO;

@Service
@AllArgsConstructor
public class RecipeService {

    private RecipeRepository recipeRepository;

    public Recipe addRecipe(RecipeDTO recipeDTO) {
        var recipe = new Recipe();
        recipe.setName(recipeDTO.getName());
        return recipeRepository.save(recipe);
    }
}
