package Factory;

public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        ChicagoPizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

        if(item.equals("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.setName("Chicago Cheese Pizza");
        }
        return pizza;
    }
}
