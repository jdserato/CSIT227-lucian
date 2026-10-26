package Oct01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Another {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = {"2", "jay", "21", "vince", "13", "68"};
        try {
            System.out.print("Enter index: ");
            int i = sc.nextInt();
            int n = Integer.parseInt(numbers[i]);
            System.out.println("Your lucky number is " + n);
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Hmm. I seem to cannot produce a number for you.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are only " + numbers.length + " to choose from.");
        }
    }
}
