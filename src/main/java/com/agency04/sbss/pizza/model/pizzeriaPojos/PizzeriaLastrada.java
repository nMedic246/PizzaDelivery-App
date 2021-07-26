package com.agency04.sbss.pizza.model.pizzeriaPojos;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PizzeriaLastrada implements PizzeriaService {

    @Value("${lastrada.name}")
    private String name;

    @Value("${lastrada.address}")
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
        System.out.println(pizza.getName()+" is making it's way to the oven!");
    }

}
