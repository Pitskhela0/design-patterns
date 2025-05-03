package decorator_pattern.coffee_example;

import decorator_pattern.coffee_example.decorators.Milk;
import decorator_pattern.coffee_example.decorators.Mocha;
import decorator_pattern.coffee_example.decorators.Soy;
import decorator_pattern.coffee_example.beverages.DarkRoast;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription());

        beverage = new Soy(beverage);
        System.out.println(beverage.getDescription());

        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());

        beverage = new Milk(beverage);
        System.out.println(beverage.getDescription());
    }
}
