package strategy_pattern.duck_example.concrete_ducks;

import strategy_pattern.duck_example.Duck;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I am rubber duck");
    }
}
