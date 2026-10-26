package Oct08;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader br =new BufferedReader(new FileReader("src/somehow.txt"));
             BufferedWriter bw =new BufferedWriter(new FileWriter("src/what.txt"))) {
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
            for (int i = 1; i <= 10; i++) {
                bw.write(i+"");
            }
        } catch (IOException e) {
            System.out.println("Error in reading file");
        }
        System.out.println("continuing with main");
    }
}
