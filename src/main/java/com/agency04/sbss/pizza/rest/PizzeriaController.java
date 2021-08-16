package com.agency04.sbss.pizza.rest;

import com.agency04.sbss.pizza.helpers.MenuItem;
import com.agency04.sbss.pizza.helpers.PizzeriaDetails;
import com.agency04.sbss.pizza.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pizzeria")
public class PizzeriaController {

    @Autowired
    private PizzeriaService pizzeriaService;


    @GetMapping("/")
    public ResponseEntity<PizzeriaDetails> getDetails(){
        return ResponseEntity.status(HttpStatus.OK).body(pizzeriaService.getDetails());
    }

    @GetMapping("/menu")
    public ResponseEntity<List<MenuItem>> orderPizza() {
        List<MenuItem> menu = pizzeriaService.getMenu();

        return ResponseEntity.status(HttpStatus.OK).body(menu);
    }

}
