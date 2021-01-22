package Strategy;

public class FlyRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Woooosh, rubber duck is flying with a rocket!");
    }
}
