package com.agency04.sbss.pizza.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class Pizza {

    @Id
    private String name;

    @Enumerated(EnumType.STRING)
    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "pizza_ingredients", joinColumns = @JoinColumn(name = "name"))
    private List<PizzaIngredient> ingredients;

    public Pizza(String name, List<PizzaIngredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public Pizza() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<PizzaIngredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<PizzaIngredient> ingredients) {
        this.ingredients = ingredients;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(name, pizza.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
