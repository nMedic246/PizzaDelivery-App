package com.agency04.sbss.pizza.model.pizzaPojos;


import java.util.Arrays;
import java.util.List;

public class Calzone implements Pizza {
    private final List<PizzaIngredient> ingredients = Arrays.asList(PizzaIngredient.TOMATO_SAUCE,PizzaIngredient.MOZZARELLA,
            PizzaIngredient.HAM,PizzaIngredient.ANCHOVIES,PizzaIngredient.OREGANO);

    private final String name = "Calzone";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        return ingredients;
    }
}
