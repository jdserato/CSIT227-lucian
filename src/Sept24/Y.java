package Sept24;

public class Y implements X, Z {
    public static void main(String[] args) {
        X.bar();
        System.out.println(X.VALUE);
    }
}
