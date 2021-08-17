package com.agency04.sbss.pizza.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private long deliveryId;

    @ManyToOne
    @JsonIgnore
    private Customer customer;

    private Date submissionDate;

    @OneToMany(mappedBy = "delivery")
    private List<PizzaOrder> pizzaOrders;


    public Delivery(Customer customer, Date submissionDate) {
        this.customer = customer;
        this.submissionDate = submissionDate;
    }

    public Delivery() {
    }

    public long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(long deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }

    public List<PizzaOrder> getPizzaOrders() {
        return pizzaOrders;
    }

    public void setPizzaOrders(List<PizzaOrder> pizzaOrders) {
        this.pizzaOrders = pizzaOrders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return deliveryId == delivery.deliveryId &&
                Objects.equals(customer, delivery.customer) &&
                Objects.equals(submissionDate, delivery.submissionDate) &&
                Objects.equals(pizzaOrders, delivery.pizzaOrders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryId, customer, submissionDate, pizzaOrders);
    }
}
