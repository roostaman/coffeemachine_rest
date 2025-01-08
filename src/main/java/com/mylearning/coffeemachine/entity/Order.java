package com.mylearning.coffeemachine.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "order")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "recipe_id", nullable = false)
    private Long recipeId;

//    @Column(name = "date", nullable = false)
    private LocalDateTime date;
}
