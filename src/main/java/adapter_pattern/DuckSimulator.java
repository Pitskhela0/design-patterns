package adapter_pattern;

import strategy_pattern.duck_example.abilities.fly_types.FlyWithAircraft;
import strategy_pattern.duck_example.abilities.quack_types.Quack;
import strategy_pattern.duck_example.concrete_ducks.MallardDuck;
import strategy_pattern.duck_example.Duck;


public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFly(new FlyWithAircraft());
        duck.setQuack(new Quack());
        // test duck
        testDuck(duck);
        System.out.println("end of testing duck");
        System.out.println();

        Turkey turkey = new BlackTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.performFly();
        duck.performQuack();
    }
}
