package Singleton;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    private static Singleton uniqueInstance2;
    private static volatile Singleton uniqueInstance3;

    private Singleton() {}

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    //Bovenstaande methode is Eeager Instantiation

    //Onderstaande methode is de normale manier
    public static synchronized  Singleton getInstance2() {
        if(uniqueInstance2 == null) {
            uniqueInstance2 = new Singleton();
        }
        return uniqueInstance2;
    }

    //Of deze methode Double-checked locking
    public static Singleton getInstance3() {
        if(uniqueInstance3 == null) {
            synchronized (Singleton.class) {
                if(uniqueInstance3 == null) {
                    uniqueInstance3 = new Singleton();
                }
            }
        }
        return uniqueInstance3;
    }
}
