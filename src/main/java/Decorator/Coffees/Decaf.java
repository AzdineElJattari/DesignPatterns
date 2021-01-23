package Decorator.Coffees;

import Decorator.Decorator;
import Decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
       description  = "Decaf coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
