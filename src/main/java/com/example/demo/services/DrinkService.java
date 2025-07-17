package com.example.demo.services;

import com.example.demo.entities.Drink;
import com.example.demo.repositories.DrinkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DrinkService {
    @Autowired
    private DrinkRepo drinkRepo;

    public void saveDrink(Drink drinkToSave) {
        drinkRepo.save(drinkToSave);
        System.out.println("drink saved in db!");
    }

    public Drink findById(long id) {
        return drinkRepo.findById(id).orElseThrow(() -> new RuntimeException("cannot find anything"));
    }

    public void deleteTopping(long id) {
        Drink d = this.findById(id);
        drinkRepo.delete(d);
        System.out.println("drink deleted");
    }
}
