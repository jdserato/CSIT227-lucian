package Prelims;

public class Developer extends Employee{
    public Developer(String name, int age, String id, double salary) {
        super(name, age, id, salary);
    }

    public Developer(String name, int age, String id) {
        super(name, age, id);
    }

    public void work(){
        System.out.println("I am " + getName() + " and I am programming.");
    }
}
