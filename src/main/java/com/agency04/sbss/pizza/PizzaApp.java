package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import com.agency04.sbss.pizza.service.PizzeriaService;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) throws InterruptedException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        PizzaDeliveryService pizzaDeliveryService  = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        Pizza pizza = context.getBean("quatroFormaggi",Pizza.class);

        System.out.println(pizzaDeliveryService.orderPizza(pizza));

        PizzeriaService pizzeriaService = context.getBean("dominos",PizzeriaService.class);
        PizzeriaService pizzeriaService2 = context.getBean("pizzeriaLastrada",PizzeriaService.class);

        System.out.println(pizzeriaService.getAddress());
        System.out.println(pizzeriaService2.getName());

        context.close();
    }

}
