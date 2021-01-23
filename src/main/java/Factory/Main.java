package Factory;

public class Main {
    public static void main(String[] args) {

        PizzaStore NYStore = new NYPizzaStore();
        NYStore.orderPizza("cheese");
    }
}
