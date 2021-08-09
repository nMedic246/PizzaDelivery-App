package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.service.impl.MenuItem;
import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;

import java.util.List;

public interface PizzeriaService {
    String getPhoneNumber();
    void setPhoneNumber(String phoneNumber);
    String getName();
    String getAddress();
    void setName(String name);
    void setAddress(String address);
    void makePizza(Pizza pizza);
    List<MenuItem> getMenu();
}
