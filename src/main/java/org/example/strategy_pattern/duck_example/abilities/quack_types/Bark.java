package org.example.strategy_pattern.duck_example.abilities.quack_types;

import org.example.strategy_pattern.duck_example.abilities.Quackable;

public class Bark implements Quackable {
    @Override
    public void quack() {
        System.out.println("bark, bark");
    }
}
