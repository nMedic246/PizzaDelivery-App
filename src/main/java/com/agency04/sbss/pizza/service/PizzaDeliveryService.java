package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class PizzaDeliveryService {

    @Qualifier("dominos")
    @Autowired
    private PizzeriaService pizzeriaService;

    public String orderPizza(Pizza pizza) throws InterruptedException {
        pizzeriaService.makePizza(pizza);
        Thread.sleep(2000);
        return pizza.getName() +" is on it's way :) !";
    }

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Inside the init method!");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside the destroy method!");
    }
}
