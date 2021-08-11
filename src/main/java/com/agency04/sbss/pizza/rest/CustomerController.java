package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/{username}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String username){
        return new ResponseEntity<>(customerService.getCustomer(username), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);
        return ResponseEntity.status(HttpStatus.OK).body("New customer successfully added!");
    }

    @PutMapping("")
    public ResponseEntity<Object> updateCustomer(@RequestBody Customer updatedCustomer){
        customerService.updateCustomer(updatedCustomer);
        return ResponseEntity.status(HttpStatus.OK).body("Customer "+updatedCustomer.getUsername()+" updated!");
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable String username){
        customerService.deleteCustomer(username);
        return ResponseEntity.status(HttpStatus.OK).body("Customer "+username+" deleted!");
    }

}
