package com.example.demo.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "drinks")
public class Drink extends Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }
}