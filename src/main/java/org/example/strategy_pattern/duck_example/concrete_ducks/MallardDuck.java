package org.example.strategy_pattern.duck_example.concrete_ducks;

import org.example.strategy_pattern.duck_example.Duck;


public class MallardDuck extends Duck {
    @Override
    public void display() {
        System.out.println("Mallard duck");
    }
}
