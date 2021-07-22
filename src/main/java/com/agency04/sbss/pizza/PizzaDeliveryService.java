package com.agency04.sbss.pizza;

public class PizzaDeliveryService {
    private PizzeriaService pizzeriaService;

    public PizzaDeliveryService(PizzeriaService pizzeriaService){
        this.pizzeriaService = pizzeriaService;
    }

    public PizzaDeliveryService(){
    }

    public void setPizzeriaService(PizzeriaService pizzeriaService){
        this.pizzeriaService = pizzeriaService;
    }

    public String orderPizza(Pizza pizza) throws InterruptedException {
        pizzeriaService.makePizza(pizza);
        Thread.sleep(2000);
        return pizza.getName() +" is on it's way :) !";
    }
}
