package com.agency04.sbss.pizza.pizzaPojos;

import com.agency04.sbss.pizza.Pizza;
import com.agency04.sbss.pizza.PizzaIngredient;

import java.util.ArrayList;
import java.util.List;

public class Vegeteriana implements Pizza {
    private List<PizzaIngredient> ingredients = new ArrayList<>();

    public Vegeteriana(){
        ingredients.add(PizzaIngredient.TOMATO_SAUCE);
        ingredients.add(PizzaIngredient.MOZZARELLA);
        ingredients.add(PizzaIngredient.VEGETABLES);
    }
    @Override
    public String getName() {
        return "Vegeteriana";
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        for(PizzaIngredient ingredient:ingredients){
            System.out.println(ingredient);
        }
        return ingredients;
    }
}
