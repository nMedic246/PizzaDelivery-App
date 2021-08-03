package com.agency04.sbss.pizza.model.pizzaPojos;

import java.util.Arrays;
import java.util.List;


public class Margherita implements Pizza {
    private final List<PizzaIngredient> ingredients = Arrays.asList(PizzaIngredient.TOMATO_SAUCE,
            PizzaIngredient.MOZZARELLA,PizzaIngredient.OREGANO);

    private final String name = "Margherita";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        return ingredients;
    }
}
