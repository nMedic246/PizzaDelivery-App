package com.agency04.sbss.pizza.model.pizzaPojos;

import java.util.List;

public interface Pizza {
    String getName();
    List<PizzaIngredient> getIngredients();
}
