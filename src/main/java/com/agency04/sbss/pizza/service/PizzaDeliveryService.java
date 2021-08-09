package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
<<<<<<< HEAD
<<<<<<< Updated upstream
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
=======
import com.agency04.sbss.pizza.rest.exceptionHandlers.PizzaNotOnTheMenuException;
import com.agency04.sbss.pizza.service.impl.DeliveryOrderForm;
import com.agency04.sbss.pizza.service.impl.MenuItem;
import com.agency04.sbss.pizza.service.util.PizzaFactory;
import com.agency04.sbss.pizza.service.impl.PizzaOrder;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
>>>>>>> Stashed changes
=======
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
>>>>>>> main

@Service
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

<<<<<<< HEAD
<<<<<<< Updated upstream
=======
    List<DeliveryOrderForm> orderList = new ArrayList<>();

=======
>>>>>>> main
    public PizzaDeliveryService(PizzeriaService pizzeria) {
        this.pizzeriaService = pizzeria;
    }

<<<<<<< HEAD
>>>>>>> Stashed changes
=======
>>>>>>> main
    public String orderPizza(Pizza pizza) throws InterruptedException {
        pizzeriaService.makePizza(pizza);
        Thread.sleep(2000);
        return pizza.getName() +" is on it's way :) !";
    }
<<<<<<< HEAD
<<<<<<< Updated upstream
=======
=======
>>>>>>> main

    //define my init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Inside the pizzeriaService init method!");
    }

    //define my destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Inside the pizzeriaService destroy method!");
    }
<<<<<<< HEAD

    public PizzeriaService getCurrentPizzeriaService(){
        return this.pizzeriaService;
    }

    public void makeOrder(DeliveryOrderForm deliveryOrderForm) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, InterruptedException {
        for(PizzaOrder order : deliveryOrderForm.getOrders()){
            Pizza pizza = PizzaFactory.newPizza(order.getPizza());

            MenuItem menuItemPizza = pizzeriaService.getMenu().stream().filter(m->pizza.equals(m.getPizza())).findAny().orElse(null);

            if(menuItemPizza==null){
                System.out.println("Nema pizze");
                throw new PizzaNotOnTheMenuException("This pizza is not on the menu!");
            }

            if(!menuItemPizza.getSizes().contains(order.getSize())){
                throw new PizzaNotOnTheMenuException("This size for "+pizza.getName()+" is not on the menu!");
            }

            this.orderPizza(pizza);
        }
        orderList.add(deliveryOrderForm);
    }

    public List<DeliveryOrderForm> getCurrentOrders(){
        return this.orderList;
    }

>>>>>>> Stashed changes
=======
>>>>>>> main
}
