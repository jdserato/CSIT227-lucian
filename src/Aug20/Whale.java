package Aug20;

public class Whale extends Mammal implements Swimmer{
    Whale(String name) {
        super(name);
    }

    public void swim() {
        System.out.println("Whale swimming");
    }

    @Override
    String makeSound() {
        return name + ": woooooo";
    }
}
