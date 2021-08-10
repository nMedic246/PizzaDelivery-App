package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.exceptionHandlers.CustomerNotFoundException;
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
        Customer customer = customerService.getCustomerList()
                .stream()
                .filter(c ->username.equals(c.getUsername()))
                .findAny()
                .orElseThrow(()-> new CustomerNotFoundException("Customer with the given username does not exist!"));

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer){
        customerService.addCustomer(customer);

        return ResponseEntity.status(HttpStatus.OK).body("New customer successfully added!");
    }

    @PutMapping("")
    public ResponseEntity<Object> updateCustomer(@RequestBody Customer updatedCustomer){
        Customer oldCustomer = customerService.getCustomerList()
                .stream()
                .filter(c ->updatedCustomer.getUsername()
                .equals(c.getUsername())).findAny()
                .orElseThrow(()-> new CustomerNotFoundException("Customer with the given username does not exist!"));
        customerService.updateCustomer(oldCustomer,updatedCustomer);

        return ResponseEntity.status(HttpStatus.OK).body("Customer "+updatedCustomer.getUsername()+" updated!");
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable String username){
        Customer customer = customerService.getCustomerList()
                .stream()
                .filter(c ->username.equals(c.getUsername()))
                .findAny()
                .orElseThrow(()-> new CustomerNotFoundException("Customer with the given username does not exist!"));
        customerService.deleteCustomer(customer);

        return ResponseEntity.status(HttpStatus.OK).body("Customer "+customer.getUsername()+" deleted!");
    }

}
