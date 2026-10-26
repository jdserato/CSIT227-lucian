package Aug20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Browny");
        Animal.Crocodile c = new Animal.Crocodile("Hi");
        System.out.println(d.makeSound());
        Bird b = new Bird("Tweety");
        Bird b2 = new Bird("tweety");
        Cockroach o = new Cockroach("Oggy");
        o.setAge(20);
        o.setAge(-7);
        Animal anim = new Dog("Low");
        Animal[] animals = {d, c, b, new Fish("Nemo"), b2, new Penguin("Wazowski"), o, new Cat("Pusa"), new Whale("Dori"), new Cat("High"), anim, new Dog("Blackie", 5)};
        List<EggLayer> eggers = new ArrayList<>();
        int totalEggs = 0;
        for (Animal a : animals) {
            if (a instanceof Swimmer s) {
                // method overloading, compile-time polymorphism
                s.swim(); // late binding, runtime polymorphism
            }
            if (a instanceof EggLayer e) {
                totalEggs += e.layEggs();
                eggers.add(e);
            }
            System.out.println(a.makeSound());
        }
        System.out.println("Total Eggs: " + totalEggs);
        System.out.println();
        Animal.printNumberOfAnimals();
        for (EggLayer e : eggers) {
            System.out.println(e.layEggs());
        }
        Collections.sort(eggers);
        System.out.println("AFTER");
        for (EggLayer e : eggers) {
            System.out.println(e.layEggs());
        }
    }
}
