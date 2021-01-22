package Decorator;

public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
