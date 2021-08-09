package com.agency04.sbss.pizza.service.util;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PizzaFactory {

    public static Pizza newPizza(String pizzaName) throws NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> opisnik = Class.forName("com.agency04.sbss.pizza.model.pizzaPojos."+pizzaName);
        Constructor<?> k = opisnik.getConstructor();
        Object o = k.newInstance();
        Pizza p = (Pizza) o;
        return p;
    }
}
