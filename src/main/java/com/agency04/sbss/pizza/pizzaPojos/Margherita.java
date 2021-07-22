package com.agency04.sbss.pizza.pizzaPojos;

import com.agency04.sbss.pizza.Pizza;
import com.agency04.sbss.pizza.PizzaIngredient;

import java.util.ArrayList;
import java.util.List;

public class Margherita implements Pizza {
    private List<PizzaIngredient> ingredients = new ArrayList<>();

    public Margherita(){
        ingredients.add(PizzaIngredient.TOMATO_SAUCE);
        ingredients.add(PizzaIngredient.MOZZARELLA);
        ingredients.add(PizzaIngredient.OREGANO);
    }
    @Override
    public String getName() {
        return "Margherita";
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        for(PizzaIngredient ingredient:ingredients){
            System.out.println(ingredient);
        }
        return ingredients;
    }
}
