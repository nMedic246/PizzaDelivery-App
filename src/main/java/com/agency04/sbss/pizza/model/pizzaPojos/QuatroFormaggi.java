package com.agency04.sbss.pizza.model.pizzaPojos;

import java.util.Arrays;
import java.util.List;


public class QuatroFormaggi  implements Pizza {
    private final List<PizzaIngredient> ingredients = Arrays.asList(PizzaIngredient.TOMATO_SAUCE,PizzaIngredient.MOZZARELLA,
            PizzaIngredient.PARMESAN,PizzaIngredient.GORGONZOLA,PizzaIngredient.OREGANO);

    private final String name = "Quatro Formaggi";

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        return ingredients;
    }
}
