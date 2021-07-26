package com.agency04.sbss.pizza.model.pizzaPojos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class Calzone implements Pizza {
    private List<PizzaIngredient> ingredients = new ArrayList<>();

    @Value("${calzone.name}")
    private String name;

    public Calzone(){
        ingredients.add(PizzaIngredient.TOMATO_SAUCE);
        ingredients.add(PizzaIngredient.MOZZARELLA);
        ingredients.add(PizzaIngredient.HAM);
        ingredients.add(PizzaIngredient.ANCHOVIES);
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
