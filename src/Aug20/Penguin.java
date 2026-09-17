package Aug20;

public class Penguin extends Bird implements Diver{
    Penguin(String name) {
        super(name);
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
