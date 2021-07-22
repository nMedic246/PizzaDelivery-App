package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.pizzaPojos.Margherita;
import com.agency04.sbss.pizza.pizzaPojos.QuatroFormaggi;
import com.agency04.sbss.pizza.pizzeriaPojos.PizzeriaLastrada;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PizzaApp {

    public static void main(String[] args) throws InterruptedException {
        Pizza pizza1 = new Margherita();
        Pizza pizza2 = new QuatroFormaggi();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        PizzaDeliveryService pizzaDeliveryService  = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);

        System.out.println(pizzaDeliveryService.orderPizza(pizza2));

        PizzeriaService pizzeriaService = context.getBean("Dominos",PizzeriaService.class);
        PizzeriaService pizzeriaService2 = context.getBean("pizzeriaLastrada",PizzeriaService.class);

        System.out.println(pizzeriaService.getAddress());
        System.out.println(pizzeriaService2.getName());

        context.close();
    }

}
