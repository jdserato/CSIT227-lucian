package Sept24;

public interface X {
    private static int foo() {
        return 1;
    }
    static void bar() {
        foo();
    }
    int VALUE = 10;
}
