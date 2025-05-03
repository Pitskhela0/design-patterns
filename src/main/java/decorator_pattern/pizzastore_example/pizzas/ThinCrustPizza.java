package decorator_pattern.pizzastore_example.pizzas;

import decorator_pattern.pizzastore_example.Pizza;

public class ThinCrustPizza extends Pizza {
    @Override
    protected int cost() {
        return 14;
    }

    @Override
    public String getDescription() {
        return "ThinCrustPizza";
    }
}
