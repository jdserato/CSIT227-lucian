package Aug20;

public abstract class Animal {
    static int count_animals;
    final String name;
    private int age;
    String breed;

    Animal(String name) {
        this.name = name;
        count_animals++;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    abstract String makeSound();

    @Override
    public String toString() {
        return name + "(" + age + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj instanceof Animal a) {
            return name.equalsIgnoreCase(a.name);
        }
        return false;
    }
}
