package org.example.strategy_pattern.duck_example;

import org.example.strategy_pattern.duck_example.abilities.Flyable;
import org.example.strategy_pattern.duck_example.abilities.Quackable;

public abstract class Duck {
    private Flyable flyBehavior;
    private Quackable quackBehavior;

    public Duck() {

    }

    abstract public void display();

    public void setFly(Flyable fly) {
        this.flyBehavior = fly;
    }

    public void setQuack(Quackable quack) {
        this.quackBehavior = quack;
    }

    public void performFly(){
        flyBehavior.fly();
    }
    public void performQuack(){
        quackBehavior.quack();
    }
}
