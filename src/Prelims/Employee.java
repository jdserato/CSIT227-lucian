package Prelims;

public class Employee extends Person{
    private final String id;
    private double salary;
    public static final double MINIMUM_SALARY = 501.25;

    public Employee(String name, int age, String id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }

    public Employee(String name, int age, String id) {
        this(name, age, id, MINIMUM_SALARY);
    }
    public String getId() {
        return id;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = Math.max(salary, MINIMUM_SALARY);
    }
}
