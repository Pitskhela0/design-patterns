package decorator_pattern.coffee_example.beverages;

import decorator_pattern.coffee_example.Beverage;

public class Decaf extends Beverage {
    @Override
    public int cost() {
        return 3;
    }
    @Override
    public String getDescription() {
        return "decaf";
    }
}
