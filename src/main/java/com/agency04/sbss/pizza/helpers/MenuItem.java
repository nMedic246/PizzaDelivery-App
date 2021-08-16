package com.agency04.sbss.pizza.helpers;

import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.model.PizzaSize;

import java.util.Set;

public class MenuItem {

    Pizza pizza;
    Set<PizzaSize> sizes;

    public MenuItem(Pizza pizza, Set<PizzaSize> sizes) {
        this.pizza = pizza;
        this.sizes = sizes;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Set<PizzaSize> getSizes() {
        return sizes;
    }

    public void setSizes(Set<PizzaSize> sizes) {
        this.sizes = sizes;
    }
}
