package Sept10;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle("red", 8), new Square("blue", 10), new Rectangle("yellow", 3, 4)};
        for (Shape s : shapes) {
            System.out.println("Area: " + s.area());
            System.out.println("Perimeter: " + s.perimeter());
        }
    }
}
