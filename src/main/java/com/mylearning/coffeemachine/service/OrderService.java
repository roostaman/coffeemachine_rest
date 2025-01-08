package com.mylearning.coffeemachine.service;

import com.mylearning.coffeemachine.dao.OrderRepository;
import com.mylearning.coffeemachine.dto.OrderDTO;
import com.mylearning.coffeemachine.entity.Order;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    public Long findPopularDrink() {
        return orderRepository.findMostPopularRecipe();
    }

    public void addOrder(OrderDTO orderDTO) {
        var order = new Order();
        order.setRecipeId(orderDTO.getRecipeId());
        order.setDate(LocalDateTime.now());
        orderRepository.save(order);
    }
}
