package Sept10;

public class Rectangle extends Shape{
    double length, width;
    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * length + 2 * width;
    }
}
