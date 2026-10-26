package Aug20;

public abstract class Animal {
    static int count_animals;
    final String name;
    private int age;
    String breed;

    public int getAge() {
        return age;
    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
        count_animals++;
    }

    Animal(String name) {
        this(name, 0);
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    static void printNumberOfAnimals() {
        System.out.println("Your number of " +
                "animals is " + count_animals);
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

    public static class Crocodile extends Animal{
        public Crocodile(String name) {
            super(name);
        }

        @Override
        String makeSound() {
            return "rawr";
        }
    }

}
