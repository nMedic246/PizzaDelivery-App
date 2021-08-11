package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.exceptionHandlers.CustomerNotFoundException;
import com.agency04.sbss.pizza.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    private List<Customer> customerList= new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    public void addCustomer(Customer customer){
        this.customerList.add(customer);
    }

    public void updateCustomer(Customer updatedCustomer){
        Customer oldCustomer = this.getCustomerList()
                .stream()
                .filter(c ->updatedCustomer.getUsername()
                        .equals(c.getUsername())).findAny()
                .orElseThrow(()-> new CustomerNotFoundException("Customer with the given username does not exist!"));

        oldCustomer.setFirstName(updatedCustomer.getFirstName());
        oldCustomer.setLastName(updatedCustomer.getLastName());
        oldCustomer.setPhoneNumber(updatedCustomer.getPhoneNumber());
        oldCustomer.setAddress(updatedCustomer.getAddress());
    }

    public void deleteCustomer(String username){
        Customer customer = this.getCustomerList()
                .stream()
                .filter(c ->username.equals(c.getUsername()))
                .findAny()
                .orElseThrow(()-> new CustomerNotFoundException("Customer with the given username does not exist!"));
        this.customerList.remove(customer);
    }

    public boolean checkCustomer(Customer customer){
        return this.customerList.contains(customer);
    }

    public Customer getCustomer(String username){
        Customer customer = this.getCustomerList()
                .stream()
                .filter(c ->username.equals(c.getUsername()))
                .findAny()
                .orElseThrow(()-> new CustomerNotFoundException("Customer with the given username does not exist!"));

        return customer;
    }
}
