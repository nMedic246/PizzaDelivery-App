package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.dao.CustomerRepository;
import com.agency04.sbss.pizza.exceptionHandlers.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void addCustomer(Customer customer){
        if(customerRepository.existsById(customer.getUsername())){
            throw new IllegalArgumentException("Customer already exists!");
        }
        customerRepository.save(customer);
    }

    public void updateCustomer(Customer updatedCustomer){
        if(!customerRepository.existsById(updatedCustomer.getUsername())){
            throw new CustomerNotFoundException("Customer with the given username does not exist!");
        }

        customerRepository.updateCustomer(updatedCustomer.getUsername(),updatedCustomer.getCustomerDetails());
    }

    public void deleteCustomer(String username){
        if(!customerRepository.existsById(username)){
            throw new CustomerNotFoundException("Customer with the given username does not exist!");
        }
        customerRepository.delete(customerRepository.findByUsername(username));
    }

    public Customer getCustomer(String username){
        if(!customerRepository.existsById(username)){
            throw new CustomerNotFoundException("Customer with the given username does not exist!");
        }
        return customerRepository.findByUsername(username);
    }

}
