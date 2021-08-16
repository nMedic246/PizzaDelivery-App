package com.agency04.sbss.pizza.dao;

import com.agency04.sbss.pizza.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza,String> {
    Pizza findByName(String name);
}
