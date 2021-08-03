package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.pizzaPojos.QuatroFormaggi;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = SpringApplication.run(PizzaApp.class,args);

        PizzaDeliveryService pizzaDeliveryService  = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        System.out.println(pizzaDeliveryService.orderPizza(new QuatroFormaggi()));
    }

}
