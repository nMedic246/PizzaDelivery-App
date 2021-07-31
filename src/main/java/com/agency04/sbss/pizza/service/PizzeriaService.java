package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;

public interface PizzeriaService {
    String getName();
    String getAddress();
    void setName(String name);
    void setAddress(String address);
    void makePizza(Pizza pizza);
}
