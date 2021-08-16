package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PizzaOrder {

    @Id
    @GeneratedValue
    private Long pizzaOrderId;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Pizza pizza;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Delivery delivery;

    @Enumerated(EnumType.STRING)
    private PizzaSize size;

    private String quantity;

    public PizzaOrder(Pizza pizza, PizzaSize size, String quantity) {
        this.pizza = pizza;
        this.size = size;
        this.quantity = quantity;
    }

    public PizzaOrder() {
    }

    public Long getPizzaOrderId() {
        return pizzaOrderId;
    }

    public void setPizzaOrderId(Long pizzaOrderId) {
        this.pizzaOrderId = pizzaOrderId;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Delivery getDelivery() {
        return delivery;
    }

    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PizzaOrder that = (PizzaOrder) o;
        return Objects.equals(pizzaOrderId, that.pizzaOrderId) &&
                Objects.equals(pizza, that.pizza) &&
                size == that.size &&
                Objects.equals(quantity, that.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pizzaOrderId, pizza, size, quantity);
    }
}

