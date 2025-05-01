package org.example.decorator_pattern.coffee_example.decorators;

import org.example.decorator_pattern.coffee_example.Beverage;
import org.example.decorator_pattern.coffee_example.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;
    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with soy";
    }
    public int cost(){
        return beverage.cost() + 16;
    }
}
