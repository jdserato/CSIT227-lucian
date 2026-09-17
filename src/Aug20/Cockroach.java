package Aug20;

public class Cockroach extends Animal {

    Cockroach(String name) {
        super(name);
    }

    @Override
    String makeSound() {
        return name + ": kkkk";
    }

    void canFly(String person) {
        System.out.println(name + " is flying towards " + person);
    }
}
