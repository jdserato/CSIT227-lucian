package Aug24;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Arf arf";
    }
}
