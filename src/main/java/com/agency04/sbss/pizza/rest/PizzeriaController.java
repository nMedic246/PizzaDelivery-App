package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.service.impl.MenuItem;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaController {

    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;

    @GetMapping("/")
    public ResponseEntity<PizzeriaService> getDetails(){
        return ResponseEntity.status(HttpStatus.OK).body(pizzaDeliveryService.getCurrentPizzeriaService());
    }

    @GetMapping("/menu")
    public ResponseEntity<List<MenuItem>> orderPizza() throws InterruptedException {
        List<MenuItem> menu = pizzaDeliveryService.getCurrentPizzeriaService().getMenu();

        return ResponseEntity.status(HttpStatus.OK).body(menu);
    }

}
