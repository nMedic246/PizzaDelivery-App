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

<<<<<<< HEAD
<<<<<<< Updated upstream
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        PizzaDeliveryService pizzaDeliveryService  = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        Pizza pizza = context.getBean("quatroFormaggi",Pizza.class);

        System.out.println(pizzaDeliveryService.orderPizza(pizza));

        PizzeriaService pizzeriaService = context.getBean("dominos",PizzeriaService.class);
        PizzeriaService pizzeriaService2 = context.getBean("pizzeriaLastrada",PizzeriaService.class);

        System.out.println(pizzeriaService.getAddress());
        System.out.println(pizzeriaService2.getName());

        context.close();
=======
>>>>>>> Stashed changes
=======
        PizzaDeliveryService pizzaDeliveryService  = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        System.out.println(pizzaDeliveryService.orderPizza(new QuatroFormaggi()));
>>>>>>> main
    }

}
