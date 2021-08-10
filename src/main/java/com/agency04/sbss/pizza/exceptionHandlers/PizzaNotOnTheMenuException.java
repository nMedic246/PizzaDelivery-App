package com.agency04.sbss.pizza.exceptionHandlers;

public class PizzaNotOnTheMenuException extends RuntimeException {


    public PizzaNotOnTheMenuException(String message) {
        super(message);
    }

    public PizzaNotOnTheMenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public PizzaNotOnTheMenuException(Throwable cause) {
        super(cause);
    }
}
