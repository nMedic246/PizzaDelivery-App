package com.agency04.sbss.pizza.service.impl;

public class PizzaOrder {

    private String pizzaName;
    private String size;
    private int quantity;

    public PizzaOrder(String pizzaName, String size, int quantity) {
        this.pizzaName = pizzaName;
        this.size = size;
        this.quantity = quantity;
    }

    public String getPizza() {
        return pizzaName;
    }

    public void setPizza(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
