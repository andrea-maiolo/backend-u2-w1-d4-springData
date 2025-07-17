package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "toppings")
public class Topping extends Food {
    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }


}