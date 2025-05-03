package decorator_pattern.pizzastore_example.toppings;

import decorator_pattern.pizzastore_example.Pizza;
import decorator_pattern.pizzastore_example.Topping;

public class Cheese extends Topping {
    private Pizza pizza;
    public Cheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", with cheese";
    }

    @Override
    protected int cost() {
        return 1;
    }
}
