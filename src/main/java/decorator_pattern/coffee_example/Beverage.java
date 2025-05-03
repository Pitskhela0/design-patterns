package decorator_pattern.coffee_example;

public abstract class Beverage {
    private String description;

    public String getDescription() {
        return description;
    }
    abstract public int cost();
}
