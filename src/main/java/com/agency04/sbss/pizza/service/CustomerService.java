package com.agency04.sbss.pizza.service;

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

    public void updateCustomer(Customer oldCustomer, Customer updatedCustomer){
        oldCustomer.setFirstName(updatedCustomer.getFirstName());
        oldCustomer.setLastName(updatedCustomer.getLastName());
        oldCustomer.setPhoneNumber(updatedCustomer.getPhoneNumber());
        oldCustomer.setAddress(updatedCustomer.getAddress());
    }

    public void deleteCustomer(Customer customer){
        this.customerList.remove(customer);
    }

    public boolean checkCustomer(Customer customer){
        return this.customerList.contains(customer);
    }
}
