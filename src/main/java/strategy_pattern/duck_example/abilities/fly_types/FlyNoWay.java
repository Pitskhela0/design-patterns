package strategy_pattern.duck_example.abilities.fly_types;

import strategy_pattern.duck_example.abilities.Flyable;

public class FlyNoWay implements Flyable {
    @Override
    public void fly() {
        System.out.println("I cannot fly");
    }
}
