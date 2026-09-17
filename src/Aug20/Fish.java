package Aug20;

public class Fish extends Animal implements Swimmer, EggLayer{
    Fish(String name) {
        super(name);
    }
    public void swim() {
        System.out.println("Swimming below 50m");
    }
    @Override
    String makeSound() {
        return name + ": bloop bloop";
    }

    @Override
    public int layEggs() {
        return 100;
    }
}
