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
        if (toppingRepo.existsByName(toppingToSave.getName())) throw new RuntimeException("already in db!");
        toppingRepo.save(toppingToSave);
        System.out.println("topping saved in db!");
    }

    public Topping findById(long id) {
        return toppingRepo.findById(id).orElseThrow(() -> new RuntimeException("cannot find anything"));
    }

    public void deleteTopping(long id) {
        Topping t = this.findById(id);
        toppingRepo.delete(t);
        System.out.println("topping deleted");
    }

    //add update and delete for all services
}
