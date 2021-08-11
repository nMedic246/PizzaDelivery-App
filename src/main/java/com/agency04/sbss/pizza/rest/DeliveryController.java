package com.agency04.sbss.pizza.rest;


import com.agency04.sbss.pizza.exceptionHandlers.CustomerNotFoundException;
import com.agency04.sbss.pizza.service.CustomerService;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {

    @Autowired
    PizzaDeliveryService pizzaDeliveryService;

    @Autowired
    CustomerService customerService;

    @PostMapping("/order")
    public ResponseEntity<Object> createOrder(@RequestBody DeliveryOrderForm deliveryOrderForm) throws InterruptedException {
        if(!customerService.checkCustomer(deliveryOrderForm.getCustomer())){
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
