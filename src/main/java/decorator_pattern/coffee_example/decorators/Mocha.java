package decorator_pattern.coffee_example.decorators;

import decorator_pattern.coffee_example.Beverage;
import decorator_pattern.coffee_example.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", with mocha";
    }
    public int cost(){
        return beverage.cost() + 14;
    }
}
