package com.agency04.sbss.pizza.model.pizzaPojos;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzaIngredient;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class Calzone extends Pizza {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (!super.equals(o)) return false;
        Calzone calzone = (Calzone) o;
        return Objects.equals(ingredients, calzone.ingredients) &&
                Objects.equals(name, calzone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, name);
    }
}
