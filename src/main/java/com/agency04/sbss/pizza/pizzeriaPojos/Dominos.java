package com.agency04.sbss.pizza.pizzeriaPojos;

import com.agency04.sbss.pizza.Pizza;
import com.agency04.sbss.pizza.PizzeriaService;

public class Dominos implements PizzeriaService {
    private String name;
    private String address;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void makePizza(Pizza pizza) {
        System.out.println("Dominos team is preparing your "+pizza.getName()+"!");
    }
}
