package com.agency04.sbss.pizza.model.pizzaPojos;

import com.agency04.sbss.pizza.model.pizzaPojos.PizzaIngredient;

import java.util.List;

public interface Pizza {
    public String getName();
    public List<PizzaIngredient> getIngredients();
}
