package Strategy;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("Looks like a redhead duck!");
    }
}
