package decorator_pattern.pizzastore_example.pizzas;

import decorator_pattern.pizzastore_example.Pizza;

public class ThickCrustPizza extends Pizza {
    @Override
    protected int cost() {
        return 12;
    }

    @Override
    public String getDescription() {
        return "ThickCrustPizza";
    }
}
