package Strategy;

public class RubberDuck extends Duck{

    public RubberDuck() {
        quackBehavior = new Squeak();
        //flyBehavior = new FlyNoWay();
        flyBehavior = new FlyRocket();
    }

    public void display() {
        System.out.println("Looks like a rubber duck!");
    }
}
