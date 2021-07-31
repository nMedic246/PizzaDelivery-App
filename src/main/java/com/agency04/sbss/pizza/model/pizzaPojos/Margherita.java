package com.agency04.sbss.pizza.model.pizzaPojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;

@Component
public class Margherita implements Pizza {
    private final List<PizzaIngredient> ingredients = Arrays.asList(PizzaIngredient.TOMATO_SAUCE,
            PizzaIngredient.MOZZARELLA,PizzaIngredient.OREGANO);

    @Value("${margherita.name}")
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
