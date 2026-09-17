package Aug13;

public class Main {
    public static void main(String[] args) {
        Student vince = new Student("1767", "Jay Vince");
        Student.numOfStudent++;
        vince.age = 18;

        System.out.println("Square root of 25: " + Math.sqrt(25));

        Student jay = new Student("24-1658-95", "Jay Jay");
        Student.numOfStudent++;
        System.out.println(jay.name);
        System.out.println(vince.name);

        Student serato = new Student("19-6168-948", "Serato", 20);
        Student.numOfStudent++;
        System.out.println(serato.name);

        System.out.println("Num of Students: " + Student.numOfStudent);
    }
}
