package com.mylearning.coffeemachine.dao;

import com.mylearning.coffeemachine.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query(value = "SELECT recipe_id FROM orders GROUP BY recipe_id ORDER BY COUNT(recipe_id) DESC LIMIT 1", nativeQuery = true)
    Long findMostPopularRecipe();

}
