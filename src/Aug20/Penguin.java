package Aug20;

public class Penguin extends Bird implements Diver{
    Penguin(String name) {
        super(name);
    }

    @Override
    public int layEggs() {
        return 1;
    }

    @Override
    public void dive() {
        System.out.println("Penguin dives");
    }

    @Override
    public void swim() {
        System.out.println("Penguin swims");
    }
}
