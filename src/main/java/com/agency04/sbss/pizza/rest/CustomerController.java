package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.model.Customer;
import com.agency04.sbss.pizza.rest.exceptionHandlers.CustomerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    @PostConstruct
    public void loadCustomers(){
        customerList.add(new Customer("Nika","Medic","nyxPriks","0982372472","Ulica fra Petra 5"));
        customerList.add(new Customer("Pero","Peric","pero","0932334343","Ulica Pere Perica 2"));
    }

    @GetMapping("/{username}")
    public ResponseEntity<Customer> getCustomer(@PathVariable String username){
        Customer customer = customerList.stream().filter(c ->username.equals(c.getUsername())).findAny().orElse(null);

        if(customer==null){
            throw new CustomerNotFoundException("Customer with the given username does not exist!");
        }
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<Object> createCustomer(@RequestBody Customer customer){
        customerList.add(customer);

        return ResponseEntity.status(HttpStatus.OK).body("New customer successfully added!");
    }

    @PutMapping("")
    public ResponseEntity<Object> updateCustomer(@RequestBody Customer updatedCustomer){
        Customer oldCustomer = customerList.stream().filter(c ->updatedCustomer.getUsername().equals(c.getUsername())).findAny().orElse(null);
        if(oldCustomer==null){
            throw new CustomerNotFoundException("Customer with the given username does not exist!");
        }

        oldCustomer.setFirstName(updatedCustomer.getFirstName());
        oldCustomer.setLastName(updatedCustomer.getLastName());
        oldCustomer.setPhoneNumber(updatedCustomer.getPhoneNumber());
        oldCustomer.setAddress(updatedCustomer.getAddress());
        return ResponseEntity.status(HttpStatus.OK).body("Customer "+updatedCustomer.getUsername()+" updated!");
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Object> deleteCustomer(@PathVariable String username){
        Customer customer = customerList.stream().filter(c ->username.equals(c.getUsername())).findAny().orElse(null);
        if(customer==null){
            throw new CustomerNotFoundException("Customer with the given username does not exist!");
        }

        customerList.remove(customer);
        return ResponseEntity.status(HttpStatus.OK).body("Customer "+customer.getUsername()+" deleted!");
    }

}
