package com.agency04.sbss.pizza.model.pizzaPojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class Calzone implements Pizza {
    private final List<PizzaIngredient> ingredients = Arrays.asList(PizzaIngredient.TOMATO_SAUCE,PizzaIngredient.MOZZARELLA,
            PizzaIngredient.HAM,PizzaIngredient.ANCHOVIES,PizzaIngredient.OREGANO);

    @Value("${calzone.name}")
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calzone calzone = (Calzone) o;
        return Objects.equals(ingredients, calzone.ingredients) &&
                Objects.equals(name, calzone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, name);
    }
}
