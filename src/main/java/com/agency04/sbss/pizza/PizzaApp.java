package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        PizzaDeliveryService pizzaDeliveryService  = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        //Pizza pizza = context.getBean("quatroFormaggi",Pizza.class);

        PizzaDeliveryService thePizzaDeliveryService = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        boolean result = (pizzaDeliveryService == thePizzaDeliveryService);

        //If the scope of the bean is singleton (as it is default) then the location should be the same,
        //because it's the same object, and if the scope is prototype then the location is different
        //and the @PreDestroy method will not be called.
        System.out.println("The beans are pointing to the same location: "+result);
/*
        System.out.println(pizzaDeliveryService.orderPizza(pizza));

        PizzeriaService pizzeriaService = context.getBean("dominos",PizzeriaService.class);
        PizzeriaService pizzeriaService2 = context.getBean("pizzeriaLastrada",PizzeriaService.class);

        System.out.println(pizzeriaService.getAddress());
        System.out.println(pizzeriaService2.getName());*/

        context.close();
    }

}
