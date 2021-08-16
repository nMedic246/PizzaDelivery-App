package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.helpers.MenuItem;
import com.agency04.sbss.pizza.helpers.PizzeriaDetails;
import com.agency04.sbss.pizza.model.Pizza;

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
    PizzeriaDetails getDetails();
}
