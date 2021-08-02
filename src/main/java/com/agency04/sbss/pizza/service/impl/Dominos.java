package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Primary
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

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        this.setName("Dominos");
        this.setAddress("Andrije Zaje 60");
        System.out.println("Inside the Dominos init method!");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside the Dominos destroy method!");
    }
}
