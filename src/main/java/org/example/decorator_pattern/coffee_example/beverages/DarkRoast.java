package org.example.decorator_pattern.coffee_example.beverages;

import org.example.decorator_pattern.coffee_example.Beverage;

public class DarkRoast extends Beverage {
    @Override
    public int cost() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "dark roast";
    }
}
