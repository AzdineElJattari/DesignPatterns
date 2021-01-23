package Decorator;

public abstract class Beverage {

    public String description = "Unknown beverage";

    public Beverage() {}

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
