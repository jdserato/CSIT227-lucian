package Oct05;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) throws WrongAgeException {
        this.name = name;
        setAge(age);
    }
    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
    public void setAge(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException(age);
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
