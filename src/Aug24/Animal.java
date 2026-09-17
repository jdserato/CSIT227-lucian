package Aug24;

public class Animal {
    String name;
    private int age;
    protected boolean asleep;

    public void birthday() {
        age++;
    }

    public boolean isAsleep() {
        return asleep;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name) {
        this(name, 0);
    }

    protected String makeSound() {
        return "animal sound";
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
