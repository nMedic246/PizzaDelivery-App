package com.agency04.sbss.pizza.model.pizzaPojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Vegeteriana implements Pizza {
    private List<PizzaIngredient> ingredients = new ArrayList<>();

    @Value("${vegeteriana.name}")
    private String name;

    public Vegeteriana(){
        ingredients.add(PizzaIngredient.TOMATO_SAUCE);
        ingredients.add(PizzaIngredient.MOZZARELLA);
        ingredients.add(PizzaIngredient.VEGETABLES);
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        for(PizzaIngredient ingredient:ingredients){
            System.out.println(ingredient);
        }
        return ingredients;
    }
}
