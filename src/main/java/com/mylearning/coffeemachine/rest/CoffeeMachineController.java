package com.mylearning.coffeemachine.rest;

import com.mylearning.coffeemachine.dto.OrderDTO;
import com.mylearning.coffeemachine.dto.RecipeDTO;
import com.mylearning.coffeemachine.entity.Recipe;
import com.mylearning.coffeemachine.service.OrderService;
import com.mylearning.coffeemachine.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CoffeeMachineController {

    private OrderService orderService;
    private RecipeService recipeService;

    @Autowired
    public CoffeeMachineController(OrderService orderService, RecipeService recipeService) {
        this.orderService = orderService;
        this.recipeService = recipeService;
    }

    @GetMapping("/statistics/popular")
    public ResponseEntity<Long> popularDrink() {

        return ResponseEntity.status(HttpStatus.OK).body(orderService.findPopularDrink());
    }

    @PostMapping("/recipe")
    public ResponseEntity<Recipe> addRecipe(@RequestBody RecipeDTO recipeDTO) {
        var savedRecipe = recipeService.addRecipe(recipeDTO);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedRecipe);
    }

    @PostMapping("/order")
    public ResponseEntity<Object> addOrder(@RequestBody OrderDTO orderDTO) {
        orderService.addOrder(orderDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
