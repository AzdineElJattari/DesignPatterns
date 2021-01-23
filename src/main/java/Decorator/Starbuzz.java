package Decorator;

import Decorator.Coffees.Decaf;
import Decorator.Condements.Mocha;
import Decorator.Condements.Soy;

public class Starbuzz {
    public static void main(String[] args) {

        Beverage beverage1 = new Decaf();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);

        System.out.println("Chosen coffee: " + beverage1.getDescription());
        System.out.println("Price: " + beverage1.cost());
    }
}
