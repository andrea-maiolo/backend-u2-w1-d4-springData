package com.example.demo.services;

import com.example.demo.entities.Topping;
import com.example.demo.repositories.ToppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingService {
    @Autowired
    private ToppingRepo toppingRepo;

    public void saveTopping(Topping toppingToSave) {
        toppingRepo.save(toppingToSave);
        System.out.println("topping saved in db!");
    }
}
