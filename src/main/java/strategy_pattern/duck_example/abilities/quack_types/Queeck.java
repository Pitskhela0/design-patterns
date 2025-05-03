package strategy_pattern.duck_example.abilities.quack_types;

import strategy_pattern.duck_example.abilities.Quackable;

public class Queeck implements Quackable {
    @Override
    public void quack() {
        System.out.println("queeck, queeck");
    }
}
