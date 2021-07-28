package com.agency04.sbss.pizza.model.pizzaPojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class QuatroFormaggi  implements Pizza {
    private final List<PizzaIngredient> ingredients = Arrays.asList(PizzaIngredient.TOMATO_SAUCE,PizzaIngredient.MOZZARELLA,
            PizzaIngredient.PARMESAN,PizzaIngredient.GORGONZOLA,PizzaIngredient.OREGANO);

    @Value("${quatro.name}")
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        return ingredients;
    }
}
