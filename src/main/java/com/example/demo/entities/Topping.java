package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "toppings")
@NoArgsConstructor
public class Topping extends Food {
    @ManyToMany(mappedBy = "listToppings")
    private List<Pizza> pizzas = new ArrayList<>();

    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }


}