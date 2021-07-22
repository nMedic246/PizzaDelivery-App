package com.agency04.sbss.pizza;

public interface PizzeriaService {
    public String getName();
    public String getAddress();
    public void setName(String name);
    public void setAddress(String address);
    public void makePizza(Pizza pizza);
}
