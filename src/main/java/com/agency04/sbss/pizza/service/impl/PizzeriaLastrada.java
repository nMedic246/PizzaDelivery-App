package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class PizzeriaLastrada implements PizzeriaService {

    @Value("${lastrada.name}")
    private String name;

    @Value("${lastrada.address}")
    private String address;

    private String phoneNumber;

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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
        this.setPhoneNumber("098774471");
        System.out.println("Inside the pizzeria Lastrada init method!");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside the pizzeria Lastrada destroy method!");
    }

}
