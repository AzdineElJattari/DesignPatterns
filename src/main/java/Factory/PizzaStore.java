package Factory;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = null;
        pizza = createPizza(type);
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.deliver();
        return pizza;
    }
    protected abstract Pizza createPizza(String item);
}
