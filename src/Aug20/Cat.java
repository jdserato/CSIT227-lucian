package Aug20;

public final class Cat extends Mammal {
    Cat(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return name + ": meow";
    }
}
