package com.agency04.sbss.pizza.service.impl;

<<<<<<< HEAD
import com.agency04.sbss.pizza.model.pizzaPojos.Calzone;
import com.agency04.sbss.pizza.model.pizzaPojos.Margherita;
=======
>>>>>>> main
import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
<<<<<<< HEAD
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
=======
>>>>>>> main

@Service
@Primary
public class Dominos implements PizzeriaService {

    @Value("${dominos.name}")
    private String name;

    @Value("${dominos.address}")
    private String address;

    private String phoneNumber;

<<<<<<< HEAD
    private List<MenuItem> menu = new ArrayList<>();

=======
>>>>>>> main
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
<<<<<<< HEAD

=======
>>>>>>> main
    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
<<<<<<< HEAD

=======
>>>>>>> main
    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void makePizza(Pizza pizza) {
        System.out.println("Dominos team is preparing your "+pizza.getName()+"!");
    }

<<<<<<< HEAD
    public void addMenuItem(MenuItem item) {
        this.menu.add(item);
    }
    @Override
    public List<MenuItem> getMenu() {
        return menu;
    }


=======
>>>>>>> main
    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        this.setPhoneNumber("0996482299");
<<<<<<< HEAD
        this.addMenuItem(new MenuItem(new Margherita(), Set.of("Small","Medium","Jumbo")));
        this.addMenuItem(new MenuItem(new Calzone(),Set.of("Medium")));
=======
        System.out.println("Inside the Dominos init method!");
>>>>>>> main
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside the Dominos destroy method!");
    }
}
