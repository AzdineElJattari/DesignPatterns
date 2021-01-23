package Factory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing the pizza with name " + name);
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        ingredientFactory.createCheese();
    }
}
