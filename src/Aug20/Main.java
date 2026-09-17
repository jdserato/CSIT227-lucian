package Aug20;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog("Browny");
        System.out.println(d.makeSound());
        Bird b = new Bird("Tweety");
        Bird b2 = new Bird("tweety");
        Cockroach o = new Cockroach("Oggy");
        o.setAge(20);
        o.setAge(-7);
        Animal anim = new Dog("Low");
        Animal[] animals = {d, b, new Fish("Nemo"), b2, new Penguin("Wazowski"), o, new Cat("Pusa"), new Whale("Dori"), new Cat("High"), anim};
        int totalEggs = 0;
        for (Animal a : animals) {
            if (a instanceof Swimmer s) {
                s.swim();
            }
            if (a instanceof EggLayer e) {
                totalEggs += e.layEggs();
            }
            System.out.println(a.makeSound());
        }
        System.out.println("Total Eggs: " + totalEggs);
        System.out.println();
        System.out.println(Animal.count_animals);
        System.out.println(Math.sqrt(9));
    }
}
