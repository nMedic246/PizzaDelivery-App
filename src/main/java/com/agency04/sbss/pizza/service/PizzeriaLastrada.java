package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PizzeriaLastrada implements PizzeriaService {

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
        System.out.println(pizza.getName()+" is making it's way to the oven!");
    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        this.setName("Pizzeria Lastrada");
        this.setAddress("Obala kneza Domagoja 56");
        System.out.println("Inside the pizzeria Lastrada init method!");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside the pizzeria Lastrada destroy method!");
    }

}
