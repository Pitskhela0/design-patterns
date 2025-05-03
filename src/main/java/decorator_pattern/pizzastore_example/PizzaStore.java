package decorator_pattern.pizzastore_example;

import decorator_pattern.pizzastore_example.pizzas.ThickCrustPizza;
import decorator_pattern.pizzastore_example.toppings.Cheese;
import decorator_pattern.pizzastore_example.toppings.Olives;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThickCrustPizza();
        System.out.println(pizza.getDescription());

        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription());

        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription());

    }
}
