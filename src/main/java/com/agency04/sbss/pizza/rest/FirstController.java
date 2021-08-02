package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.pizzaPojos.Vegeteriana;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;

    @GetMapping("/")
    public String orderPizza() throws InterruptedException {
        return pizzaDeliveryService.orderPizza(new Vegeteriana()
        );
    }

}
