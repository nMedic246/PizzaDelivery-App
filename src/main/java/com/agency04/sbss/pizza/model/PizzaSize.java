package com.agency04.sbss.pizza.model;

public enum PizzaSize {
    SMALL("Small"),
    MEDIUM("Medium"),
    LARGE("Large");

    private String pizzaSize;

    PizzaSize(String pizzaSize) {
        this.pizzaSize = pizzaSize;
    }

    public String getPizzaSize() {
        return pizzaSize;
    }
}
