package Aug20;

public final class Cat extends Mammal {
    Cat(String name) {
        super(name);
    }

    @Override
    void provideMilk() {
        System.out.println("Cat is providing milk to its litter.");
    }

    @Override
    String makeSound() {
        return name + ": meow";
    }
}
