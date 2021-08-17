package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.form.DeliveryOrderForm;
import com.agency04.sbss.pizza.model.MenuItem;
import com.agency04.sbss.pizza.model.*;
import com.agency04.sbss.pizza.service.CustomerService;
import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.PizzaService;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppStartupRunner implements ApplicationRunner {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private PizzaService pizzaService;

    @Autowired
    private PizzeriaService pizzeriaService;

    @Autowired
    private PizzaDeliveryService pizzaDeliveryService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        addCustomers();
        addPizzas();
        addDeliveries();
    }

    public void addCustomers(){
        customerService.addCustomer(new Customer("nyx1234", new CustomerDetails("Nika", "Medic", "0983232442"),new ArrayList<>()));
        customerService.addCustomer(new Customer("romana", new CustomerDetails("Romana","Ribicic","093232442"),new ArrayList<>()));
    }


    private void addPizzas(){
        for(MenuItem menuItem : pizzeriaService.getMenu()){
            pizzaService.savePizza(menuItem.getPizza());
        }
    }

    private void addDeliveries() throws InterruptedException {
        List<PizzaOrder> orders = new ArrayList<>();
        orders.add(new PizzaOrder(pizzaService.getPizza("Margherita"), PizzaSize.MEDIUM,"one"));
        pizzaDeliveryService.makeOrder(new DeliveryOrderForm(customerService.getCustomer("romana"),orders));
    }
}
