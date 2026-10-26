package Sept10;

import java.util.Comparator;

public abstract class Shape implements Comparable<Shape> {
    String color;
    Shape(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return color;
    }

    abstract double area();
    abstract double perimeter();

    @Override
    public int compareTo(Shape o) {
        int res = color.compareTo(o.color);
        if (res == 0) {
            return Double.compare(this.area(), o.area());
        }
        return res;
    }

    public static class AreaComparator implements Comparator<Shape> {
        @Override
        public int compare(Shape o1, Shape o2) {
            return Double.compare(o1.area(), o2.area());
        }
    }
}
