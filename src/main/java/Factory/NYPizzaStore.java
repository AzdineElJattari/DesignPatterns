package Factory;

import java.util.Locale;

public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        item.toLowerCase(Locale.ROOT);
        Pizza pizza = null;
        NYPizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("New York Cheese Pizza");
        }
        return pizza;
    }
}
