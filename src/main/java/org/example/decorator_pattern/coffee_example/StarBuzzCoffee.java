package org.example.decorator_pattern.coffee_example;

import org.example.decorator_pattern.coffee_example.beverages.DarkRoast;
import org.example.decorator_pattern.coffee_example.decorators.Milk;
import org.example.decorator_pattern.coffee_example.decorators.Mocha;
import org.example.decorator_pattern.coffee_example.decorators.Soy;

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
