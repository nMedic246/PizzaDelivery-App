package com.agency04.sbss.pizza.model.pizzaPojos;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuatroFormaggi that = (QuatroFormaggi) o;
        return Objects.equals(ingredients, that.ingredients) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredients, name);
    }
}
