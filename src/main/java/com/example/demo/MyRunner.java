package com.example.demo;

import com.example.demo.entities.Topping;
import com.example.demo.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private ToppingService toppingService;

    @Override
    public void run(String... args) throws Exception {
        Topping ham = new Topping("ham", 1.50, 100);
        toppingService.saveTopping(ham);
    }
}
