package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "pizzas")
public class Pizza extends Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToMany
    @JoinTable(
            name = "pizzas_toppings",
            joinColumns = @JoinColumn(name = "pizza_id"),
            inverseJoinColumns = @JoinColumn(name = "topping_id")
    )
    private List<Topping> listToppings;

    public Pizza(String name, double price, int calories, List<Topping> toppingList) {
        super(name, price, calories);
        this.listToppings = toppingList;
    }

    public void addTopping(Topping t) {
        this.listToppings.add(t);
        caloriesCount();
        priceCount();
    }

    public void priceCount() {
        double toppingsPrice = this.listToppings.stream()
                .mapToDouble(t -> t.getPrice())
                .sum();
        this.price = 5 + toppingsPrice;
    }

    public void caloriesCount() {
        int toppingsCal = this.listToppings.stream()
                .mapToInt(t -> t.getCalories())
                .sum();
        this.calories = 300 + toppingsCal;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "listToppings=" + listToppings +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}