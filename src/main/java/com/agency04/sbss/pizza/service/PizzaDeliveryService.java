package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

    public PizzaDeliveryService(PizzeriaService pizzeria) {
        this.pizzeriaService = pizzeria;
    }

    public String orderPizza(Pizza pizza) throws InterruptedException {
        pizzeriaService.makePizza(pizza);
        Thread.sleep(2000);
        return pizza.getName() +" is on it's way :) !";
    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Inside the pizzeriaService init method!");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside the pizzeriaService destroy method!");
    }
}
