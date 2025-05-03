package strategy_pattern.duck_example.abilities.fly_types;

import strategy_pattern.duck_example.abilities.Flyable;

public class FlyWithAircraft implements Flyable {
    @Override
    public void fly() {
        System.out.println("I am cool duck, I fly with aircraft");
    }
}
