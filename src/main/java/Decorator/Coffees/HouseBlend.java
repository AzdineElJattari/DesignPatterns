package Decorator.Coffees;

import Decorator.Decorator;
import Decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description  = "House blended coffee";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
