package org.example.decorator_pattern.pizzastore_example.toppings;

import org.example.decorator_pattern.pizzastore_example.Pizza;
import org.example.decorator_pattern.pizzastore_example.Topping;

public class Olives extends Topping {
    private Pizza pizza;
    public Olives(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", with olives";
    }

    @Override
    protected int cost() {
        return 2;
    }
}
