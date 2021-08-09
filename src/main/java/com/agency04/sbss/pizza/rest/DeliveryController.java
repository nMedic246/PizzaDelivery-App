package com.agency04.sbss.pizza.rest;


import com.agency04.sbss.pizza.rest.exceptionHandlers.CustomerNotFoundException;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.impl.DeliveryOrderForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.lang.reflect.InvocationTargetException;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @Autowired
    PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    CustomerController customerController;

    @PostMapping("")
    public ResponseEntity<Object> createOrder(@RequestBody DeliveryOrderForm deliveryOrderForm) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, InterruptedException {
        if(!customerController.getCustomerList().contains(deliveryOrderForm.getCustomer())){
            throw new CustomerNotFoundException("Customer isn't registered!");
        }
        pizzaDeliveryService.makeOrder(deliveryOrderForm);
        return ResponseEntity.status(HttpStatus.OK).body("The order is on it's way!");
    }

    @GetMapping("/list")
    public ResponseEntity<Object> getOrders(){
        return new ResponseEntity(pizzaDeliveryService.getCurrentOrders(), HttpStatus.OK);
    }

}
