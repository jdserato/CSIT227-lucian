package Aug20;

public abstract class Mammal extends Animal{
    Mammal(String name) {
        super(name);
    }

    public Mammal(String name, int age) {
        super(name, age);
    }

    void provideMilk() {
        System.out.println("Providing milk");
    }
}
