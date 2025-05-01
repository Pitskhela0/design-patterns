package org.example.decorator_pattern.pizzastore_example;

public abstract class Pizza {
    private String description;

    public String getDescription() {
        return description;
    }

    protected abstract int cost();
}
