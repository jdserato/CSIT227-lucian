package Prelims;

public class Manager extends Employee{
    public Manager(String name, int age, String id, double salary) {
        super(name, age, id, salary);
    }

    public Manager(String name, int age, String id) {
        super(name, age, id);
    }

    public void work(Developer d) {
        System.out.println("Hi! I am " + getName() + ". Can you program this for me, " + d.getName() + "?");
        d.work();
        d.setSalary(d.getSalary() + 25.60);
    }
}
