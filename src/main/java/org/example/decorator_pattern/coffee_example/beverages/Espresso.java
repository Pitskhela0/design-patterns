package org.example.decorator_pattern.coffee_example.beverages;

import org.example.decorator_pattern.coffee_example.Beverage;

public class Espresso extends Beverage {
    @Override
    public int cost() {
        return 4;
    }
    @Override
    public String getDescription() {
        return "espresso";
    }
}
