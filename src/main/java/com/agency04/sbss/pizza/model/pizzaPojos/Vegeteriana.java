package com.agency04.sbss.pizza.model.pizzaPojos;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzaIngredient;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Vegeteriana extends Pizza {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!super.equals(o)) return false;
        Vegeteriana that = (Vegeteriana) o;
        return Objects.equals(ingredients, that.ingredients) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, name);
    }
}
