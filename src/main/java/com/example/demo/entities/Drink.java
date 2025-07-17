package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "drinks")
@NoArgsConstructor
public class Drink extends Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }
}