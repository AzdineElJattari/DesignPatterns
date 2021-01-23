package Decorator.Coffees;

import Decorator.Decorator;
import Decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description  = "Espresso coffee";
    }
    @Override
    public double cost() {
        return 1.20;
    }
}
