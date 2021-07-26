package com.agency04.sbss.pizza.model.pizzeriaPojos;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dominos implements PizzeriaService {

    @Value("${dominos.name}")
    private String name;

    @Value("${dominos.address}")
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
