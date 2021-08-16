package com.agency04.sbss.pizza.model;

public enum PizzaIngredient {
    TOMATO_SAUCE("Tomato Sauce"),
    MOZZARELLA("Mozzarella"),
    OREGANO("Oregano"),
    PARMESAN("Parmesan"),
    GORGONZOLA("Gorgonzola"),
    HAM("Ham"),
    MUSHROOMS("Mushrooms"),
    ANCHOVIES("Anchovies"),
    VEGETABLES("Vegetables");

    private String pizzaIngredient;

    PizzaIngredient(String pizzaIngredient) {
        this.pizzaIngredient = pizzaIngredient;
    }

    public String getPizzaIngredient() {
        return pizzaIngredient;
    }
}
