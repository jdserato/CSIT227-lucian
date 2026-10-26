package Oct05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter age: ");
            try {
                int age = sc.nextInt();
                Person p = new Person("Vince", age);
                System.out.println(p);
                break;
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Input is not an integer.");
            } catch (Exception e) {
                System.out.println(e.getClass().getSimpleName());
                System.out.println(e.getMessage());
            }
        }
    }
}
