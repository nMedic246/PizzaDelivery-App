package com.agency04.sbss.pizza;

import com.agency04.sbss.pizza.service.PizzaDeliveryService;
import com.agency04.sbss.pizza.service.impl.PizzeriaLastrada;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.agency04.sbss.pizza")
@PropertySource("classpath:application.properties")
public class PizzaConfig {

    /*@Bean
    public PizzeriaService pizzeriaLastrada(){
       return new PizzeriaLastrada();
    }

    @Bean
    public PizzaDeliveryService pizzaDeliveryService(){
        return new PizzaDeliveryService(pizzeriaLastrada());
    }*/
}
