package Aug24;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("Vince", 20);
        a.name = "Jay Vince";
        a.birthday();
        System.out.println(a.getAge());
        System.out.println(a.isAsleep());
        System.out.println(a);
        Cat c = new Cat("Tom", 10);
        System.out.println(c);
    }
}
