package com.example.demo;

import com.example.demo.entities.Topping;
import com.example.demo.services.DrinkService;
import com.example.demo.services.PizzaService;
import com.example.demo.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private ToppingService toppingService;

    @Autowired
    private DrinkService drinkService;

    @Autowired
    private PizzaService pizzaService;

    @Override
    public void run(String... args) throws Exception {
        //filling the db
        //topppings
//        Topping ham = new Topping("ham", 1.50, 100);
//        Topping salame = new Topping("salame", 2.50, 300);
//        Topping mushroom = new Topping("mushroom", 1.50, 200);
//        Topping mozzarella = new Topping("mozzarella", 1.00, 100);
//        Topping tomato = new Topping("tomato", 1.00, 0);
//        Topping anchovie = new Topping("anchovie", 3.50, 400);
//        Topping potato = new Topping("potato", 2.00, 450);
//
//        toppingService.saveTopping(salame);
//        toppingService.saveTopping(mushroom);
//        toppingService.saveTopping(anchovie);
//        toppingService.saveTopping(tomato);
//        toppingService.saveTopping(potato);
//        toppingService.saveTopping(mozzarella);

        //drinks
//        Drink coke = new Drink("coke", 2.50, 300);
//        Drink water = new Drink("water", 1.00, 0);
//        Drink beer = new Drink("beer", 3.00, 350);
//        Drink wine = new Drink("wine", 4.00, 400);
//
//        drinkService.saveDrink(coke);
//        drinkService.saveDrink(water);
//        drinkService.saveDrink(wine);
//        drinkService.saveDrink(beer);

        //pizzas
        Topping mushroom = toppingService.findById(2);
        Topping mozzarella = toppingService.findById(6);
        Topping tomato = toppingService.findById(4);
        Topping salame = toppingService.findById(1);
        Topping potato = toppingService.findById(5);
        Topping anchovie = toppingService.findById(3);

//        List<Topping> mylist = new ArrayList<>(List.of(mozzarella, tomato));
//        List<Topping> mylist2 = new ArrayList<>(List.of(tomato, mozzarella, anchovie));
//        List<Topping> mylist3 = new ArrayList<>(List.of(tomato, mozzarella, salame));
//
//        Pizza margherita = new Pizza("margherita", 2.50, 300, mylist);
//        Pizza salamiPizza = new Pizza("salamiPizza", 2.50, 300, mylist3);
//        Pizza anchoviesPizza = new Pizza("anchoviesPizza", 2.50, 300, mylist2);
////
//        pizzaService.savePizza(margherita);
//        pizzaService.savePizza(salamiPizza);
//        pizzaService.savePizza(anchoviesPizza);

        //adding toppings
        //getting pizza and topping from db
//        Pizza hm = pizzaService.findById(103);
//        hm.getListToppings().size();

    }
}