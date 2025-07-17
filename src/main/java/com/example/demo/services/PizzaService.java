package com.example.demo.services;

import com.example.demo.entities.Pizza;
import com.example.demo.repositories.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepo pizzaRepo;

    public void savePizza(Pizza pizzaToSave) {
        pizzaRepo.save(pizzaToSave);
        System.out.println("pizza saved in db!");
    }

    public Pizza findById(long id) {
        return pizzaRepo.findById(id).orElseThrow(() -> new RuntimeException("cannot find anything"));
    }
}
