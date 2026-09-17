package Aug13;

public class Student {
    // CLASS VARIABLES
    static int numOfStudent;

    // FIELDS / INSTANCE VARIABLES
    final String id;
    public final String name;
    int age;

    // METHODS

    // CONSTRUCTOR
    public Student(String id, String name) {
        this(id, name, 18);
    }

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void study() {
        System.out.println(name + " is studying");
    }
}
