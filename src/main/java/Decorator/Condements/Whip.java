package Decorator.Condements;

import Decorator.Beverage;
import Decorator.Decorator;

public class Whip extends Decorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
