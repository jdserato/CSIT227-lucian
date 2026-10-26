package Oct01;

import Oct05.WrongAgeException;

public class Person {
    private final String name;
    private int age;

    public Person(String name, int age) throws WrongAgeException {
        this.name = name;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws WrongAgeException {
        if (age < 0) {
            throw new WrongAgeException(age);
        }
        this.age = age;
    }
}
