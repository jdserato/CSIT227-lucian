package Oct05;

public class WrongAgeException extends Exception {
    public WrongAgeException() {
        super("Age cannot be negative");
    }

    public WrongAgeException(int age) {
        super("Age cannot be negative: " + age);
    }
}
