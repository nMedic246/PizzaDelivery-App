package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.model.pizzaPojos.QuatroFormaggi;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PizzaApp {

    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PizzaConfig.class);
        PizzaDeliveryService pizzaDeliveryService  = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);

        /*PizzaDeliveryService thePizzaDeliveryService = context.getBean("pizzaDeliveryService",PizzaDeliveryService.class);
        boolean result = (pizzaDeliveryService == thePizzaDeliveryService);

        //If the scope of the bean is singleton (as it is default) then the location should be the same,
        //because it's the same object, and if the scope is prototype then the location is different
        //and the @PreDestroy method will not be called.
        System.out.println("The beans are pointing to the same location: "+result);*/

        System.out.println(pizzaDeliveryService.orderPizza(new QuatroFormaggi()));

        context.close();
    }

}
