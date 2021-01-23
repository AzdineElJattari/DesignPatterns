package Factory;

public abstract class Pizza {

    String name;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350°C");
    };
    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    };
    void box() {
        System.out.println("Placing the pizza inside a box");
    };
    void deliver() {
        System.out.println(getName() + ", is ready to deliver!");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
