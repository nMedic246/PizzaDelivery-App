package com.agency04.sbss.pizza.service.impl;

import com.agency04.sbss.pizza.model.Customer;

import java.util.List;

public class DeliveryOrderForm {

    private Customer customer;
    private List<PizzaOrder> orders;

    public DeliveryOrderForm(Customer customer, List<PizzaOrder> orders) {
        this.customer = customer;
        this.orders = orders;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<PizzaOrder> getOrders() {
        return orders;
    }

    public void setOrders(List<PizzaOrder> orders) {
        this.orders = orders;
    }
}
