package Aug20;

public class Bird extends Animal implements EggLayer{
    Bird(String name) {
        super(name);
    }

    void canFly() {
        System.out.println(super.name + " is flying to the skies ");
    }

    @Override
    String makeSound() {
        return name + ": tweet || chirp";
    }
}
