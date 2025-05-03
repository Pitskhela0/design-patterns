package strategy_pattern.duck_example;

import strategy_pattern.duck_example.abilities.fly_types.FlyWithWings;
import strategy_pattern.duck_example.abilities.quack_types.Quack;
import strategy_pattern.duck_example.concrete_ducks.RedheadDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck readheadDuck = new RedheadDuck();
        readheadDuck.setQuack(new Quack());
        readheadDuck.setFly(new FlyWithWings());

        readheadDuck.performFly();
        readheadDuck.performQuack();
        readheadDuck.display();
    }
}
