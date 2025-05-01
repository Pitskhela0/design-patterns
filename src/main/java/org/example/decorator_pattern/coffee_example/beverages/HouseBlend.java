package org.example.decorator_pattern.coffee_example.beverages;

import org.example.decorator_pattern.coffee_example.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public int cost() {
        return 1;
    }
    @Override
    public String getDescription() {
        return "house blend";
    }
}
