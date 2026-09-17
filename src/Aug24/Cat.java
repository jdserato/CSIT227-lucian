package Aug24;

public class Cat extends Animal{
    int lives;
    public Cat(String name, int lives) {
        super(name);
        this.lives = lives;
    }

    @Override
    public String toString() {
        return super.toString() + " has " + lives + " lives";
    }
}
