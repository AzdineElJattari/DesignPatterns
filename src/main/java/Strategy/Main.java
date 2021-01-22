package Strategy;

public class Main {
    public static void main(String[] args) {

        // STRATEGY PATTERN

        //Creating objects
        Duck decoyDuck = new DecoyDuck();
        Duck mallardDuck = new MallardDuck();
        Duck redheadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        //Decoy
        decoyDuck.display();
        decoyDuck.flyBehavior.fly();
        System.out.println();

        //Mallard
        mallardDuck.display();
        mallardDuck.flyBehavior.fly();
        System.out.println();

        //Redhead
        redheadDuck.display();
        redheadDuck.flyBehavior.fly();
        System.out.println();

        //Rubber
        rubberDuck.display();
        rubberDuck.flyBehavior.fly();
    }
}
