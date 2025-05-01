package org.example.strategy_pattern.duck_example.abilities.fly_types;

import org.example.strategy_pattern.duck_example.abilities.Flyable;

public class FlyWithWings implements Flyable {
    @Override
    public void fly() {
        System.out.println("Look at me, I am flying");
    }
}
