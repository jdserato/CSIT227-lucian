package Aug20;

public class Dog extends Mammal {
    Dog(String name) {
        super(name);
    }

    void bite() {
        System.out.println(name + " is biting you");
    }

    @Override
    String makeSound() {
        return name + ": woof || bark";
    }
}
