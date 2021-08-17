package com.agency04.sbss.pizza.model.pizzaPojos;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzaIngredient;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Margherita extends Pizza {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ) return false;
        if (!super.equals(o)) return false;
        Margherita that = (Margherita) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
