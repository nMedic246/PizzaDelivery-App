package com.agency04.sbss.pizza.model.pizzaPojos;

import java.util.Arrays;
import java.util.List;

public class Vegeteriana implements Pizza {
    private List<PizzaIngredient> ingredients = Arrays.asList(PizzaIngredient.TOMATO_SAUCE,PizzaIngredient.MOZZARELLA,
            PizzaIngredient.VEGETABLES);


    private final String name = "Vegeteriana";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        return ingredients;
    }
}
