package org.example.strategy_pattern.duck_example.concrete_ducks;

import org.example.strategy_pattern.duck_example.Duck;


public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("yellow wet duck");
    }
}
