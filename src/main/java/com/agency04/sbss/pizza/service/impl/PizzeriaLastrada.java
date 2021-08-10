package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.MenuItem;
import com.agency04.sbss.pizza.model.pizzaPojos.*;
import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PizzeriaLastrada implements PizzeriaService {

    @Value("${lastrada.name}")
    private String name;

    @Value("${lastrada.address}")
    private String address;

    private String phoneNumber;

    private List<MenuItem> menu = new ArrayList<>();


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

    public void addMenuItem(MenuItem item) {
        this.menu.add(item);
    }

    @Override
    public List<MenuItem> getMenu() {
        return menu;
    }

    @Override
    public String getDetails() {
        return "Pizzeria : "+this.name +"\n"
                + "Address : "+this.address +"\n"
                + "Phone number : "+this.phoneNumber;
    }


    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        this.setPhoneNumber("098774471");

        this.addMenuItem(new MenuItem(new Vegeteriana(), Set.of("Small","Medium","Jumbo")));
        this.addMenuItem(new MenuItem(new QuatroFormaggi(),Set.of("Medium","Jumbo")));

        System.out.println("Inside the pizzeria Lastrada init method!");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside the pizzeria Lastrada destroy method!");
    }

}
