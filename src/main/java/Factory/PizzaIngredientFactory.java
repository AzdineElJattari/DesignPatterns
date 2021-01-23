package Factory;

import Factory.Interfaces.Cheese;
import Factory.Interfaces.Dough;
import Factory.Interfaces.Sauce;

public interface PizzaIngredientFactory {

     Dough createDough();
     Sauce createSauce();
     Cheese createCheese();
}
