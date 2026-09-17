package Another;

import Aug24.Animal;

public class Giraffe extends Animal {
    public Giraffe(String name, int age) {
        super(name, age);
    }

    @Override
    protected String makeSound() {
        return "graf";
    }
}
