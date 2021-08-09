package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;

import java.util.Set;
import java.util.TreeSet;

public class MenuItem {

    Pizza pizza;
    Set<String> sizes = new TreeSet<>();

    public MenuItem(Pizza pizza, Set<String> sizes) {
        this.pizza = pizza;
        this.sizes = sizes;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Set<String> getSizes() {
        return sizes;
    }

    public void setSizes(Set<String> sizes) {
        this.sizes = sizes;
    }
}
