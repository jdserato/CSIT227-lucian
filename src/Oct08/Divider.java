package Oct08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divider {
    public static void performTask() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        if (b == 0) {
            throw new ArithmeticException();
        }
        int quotient = a / b;
        System.out.println("The quotient is " + quotient);
    }
}
