package Prelims;

public class Customer extends Person{
    public Customer(String name, int age) {
        super(name, age);
    }

    public void purchase(String item, double amount) {
        System.out.println(getName() + " buys " + item + " worth " + String.format("%.2f", amount));
    }

    public void purchase(String item, int number) {
        System.out.println(getName() + " buys " + number + " pieces of " + item);

    }
}
