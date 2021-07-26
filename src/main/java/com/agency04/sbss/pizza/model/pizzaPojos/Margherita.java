package com.agency04.sbss.pizza.model.pizzaPojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Margherita implements Pizza {
    private List<PizzaIngredient> ingredients = new ArrayList<>();

    @Value("${margherita.name}")
    private String name;

    public Margherita(){
        ingredients.add(PizzaIngredient.TOMATO_SAUCE);
        ingredients.add(PizzaIngredient.MOZZARELLA);
        ingredients.add(PizzaIngredient.OREGANO);
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public List<PizzaIngredient> getIngredients() {
        for(PizzaIngredient ingredient:ingredients){
            System.out.println(ingredient);
        }
        return ingredients;
    }
}
