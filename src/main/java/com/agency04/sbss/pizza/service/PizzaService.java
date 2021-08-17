package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.repository.PizzaRepository;
import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public void savePizza(Pizza pizza){
        Pizza newPizza = new Pizza(pizza.getName(),pizza.getIngredients());
        pizzaRepository.save(newPizza);
    }

    public Pizza getPizza(String name) {
        return pizzaRepository.findByName(name);
    }
}
