package com.agency04.sbss.pizza.model;

public class PizzaOrder {

    private String pizzaName;
    private String size;
    private int quantity;

    public PizzaOrder(String pizzaName, String size, int quantity) {
        this.pizzaName = pizzaName;
        this.size = size;
        this.quantity = quantity;
    }

    public String getPizzaName() {
        return this.pizzaName;
    }

    public void setPizzaName(String pizzaName) {
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
