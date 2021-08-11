package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.model.pizzaPojos.Pizza;
import com.agency04.sbss.pizza.exceptionHandlers.PizzaNotOnTheMenuException;
import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.MenuItem;
import com.agency04.sbss.pizza.model.PizzaOrder;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;;
import java.util.ArrayList;
import java.util.List;

@Service
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

    List<DeliveryOrderForm> orderList = new ArrayList<>();

    public PizzaDeliveryService(PizzeriaService pizzeria) {
        this.pizzeriaService = pizzeria;
    }

    public String orderPizza(Pizza pizza) throws InterruptedException {
        pizzeriaService.makePizza(pizza);
        Thread.sleep(2000);
        return pizza.getName() +" is on it's way :) !";
    }

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

    public PizzeriaService getCurrentPizzeriaService(){
        return this.pizzeriaService;
    }

    public void makeOrder(DeliveryOrderForm deliveryOrderForm) throws InterruptedException {
        for(PizzaOrder order : deliveryOrderForm.getOrders()){

            MenuItem menuItemPizza = pizzeriaService.getMenu()
                                        .stream()
                                        .filter(m-> m.getPizza().getName().equals(order.getPizzaName()))
                                        .findAny()
                                        .orElseThrow(()->new PizzaNotOnTheMenuException("This pizza is not on the menu!"));

            if(!menuItemPizza.getSizes().contains(order.getSize())){
                throw new PizzaNotOnTheMenuException("This size for "+order.getPizzaName()+" is not on the menu!");
            }

            this.orderPizza(menuItemPizza.getPizza());
        }
        orderList.add(deliveryOrderForm);
    }

    public List<DeliveryOrderForm> getCurrentOrders(){
        return this.orderList;
    }

}
