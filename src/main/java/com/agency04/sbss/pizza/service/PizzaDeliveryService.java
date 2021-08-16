package com.agency04.sbss.pizza.service;

import com.agency04.sbss.pizza.dao.CustomerRepository;
import com.agency04.sbss.pizza.dao.DeliveryRepository;
import com.agency04.sbss.pizza.dao.PizzaOrderRepository;
import com.agency04.sbss.pizza.dao.PizzaRepository;
import com.agency04.sbss.pizza.exceptionHandlers.CustomerNotFoundException;
import com.agency04.sbss.pizza.helpers.MenuItem;
import com.agency04.sbss.pizza.model.Delivery;
import com.agency04.sbss.pizza.model.Pizza;
import com.agency04.sbss.pizza.exceptionHandlers.PizzaNotOnTheMenuException;
import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.PizzaOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PizzaDeliveryService {

    private PizzeriaService pizzeriaService;

    @Autowired
    private DeliveryRepository deliveryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private PizzaRepository pizzaRepository;

    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;


    public PizzaDeliveryService(PizzeriaService pizzeria) {
        this.pizzeriaService = pizzeria;
    }

    public String orderPizza(Pizza pizza) throws InterruptedException {
        pizzeriaService.makePizza(pizza);
        Thread.sleep(2000);
        return pizza.getName() +" is on it's way :) !";
    }


    public PizzeriaService getCurrentPizzeriaService(){
        return this.pizzeriaService;
    }

    public void makeOrder(DeliveryOrderForm deliveryOrderForm) throws InterruptedException {

        if(!customerRepository.existsById(deliveryOrderForm.getCustomer().getUsername())){
            throw new CustomerNotFoundException("Customer isn't registered!");
        }
        List<PizzaOrder> orders = new ArrayList<>();

        for(PizzaOrder order : deliveryOrderForm.getOrders()){
            MenuItem menuItemPizza = pizzeriaService.getMenu()
                                        .stream()
                                        .filter(m-> m.getPizza().getName().equals(order.getPizza().getName())
                                        )
                                        .findFirst()
                                        .orElseThrow(()->new PizzaNotOnTheMenuException("This pizza is not on the menu!"));

            if(!menuItemPizza.getSizes().contains(order.getSize())){
                throw new PizzaNotOnTheMenuException("This size for "+order.getPizza().getName()+" is not on the menu!");
            }

            this.orderPizza(menuItemPizza.getPizza());
            PizzaOrder o = new PizzaOrder(pizzaRepository.findByName(order.getPizza().getName()),order.getSize(),order.getQuantity());

            pizzaOrderRepository.save(o);
            orders.add(o);
        }

        Delivery delivery = new Delivery(deliveryOrderForm.getCustomer(),new Date());

        deliveryRepository.save(delivery);
    }

    public List<Delivery> getCurrentOrders(){
        return deliveryRepository.findAll();
    }

}
