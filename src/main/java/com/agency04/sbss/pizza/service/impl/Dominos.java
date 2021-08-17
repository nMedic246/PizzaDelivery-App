package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.MenuItem;
import com.agency04.sbss.pizza.model.PizzeriaDetails;
import com.agency04.sbss.pizza.model.PizzaSize;
import com.agency04.sbss.pizza.model.pizzaPojos.Calzone;
import com.agency04.sbss.pizza.model.pizzaPojos.Margherita;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@Primary
public class Dominos implements PizzeriaService {

    @Value("${dominos.name}")
    private String name;

    @Value("${dominos.address}")
    private String address;

    private String phoneNumber;

    private List<MenuItem> menu = new ArrayList<>();

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
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void makePizza(Pizza pizza) {
        System.out.println("Dominos team is preparing your "+pizza.getName()+"!");
    }

    public void addMenuItem(MenuItem item) {
        this.menu.add(item);
    }
    @Override
    public List<MenuItem> getMenu() {
        return menu;
    }

    @Override
    public PizzeriaDetails getDetails() {
        return new PizzeriaDetails(this.name,this.address,this.phoneNumber);
    }


    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        this.setPhoneNumber("0996482299");
        this.addMenuItem(new MenuItem(new Margherita(), Set.of(PizzaSize.SMALL,PizzaSize.MEDIUM,PizzaSize.LARGE)));
        this.addMenuItem(new MenuItem(new Calzone(),Set.of(PizzaSize.MEDIUM)));
    }

}
