package Sept10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("red", 8));
        shapes.add(new Rectangle("yellow", 3, 4));
        shapes.add(new Square("red", 10));
        for (Shape s : shapes) {
            System.out.print(s);
            System.out.println(" Area: " + s.area());
//            System.out.println("Perimeter: " + s.perimeter());
        }
        int[] numbers = {6,2,7,1,8,3,4,9,0};
        List<Integer> nums = new ArrayList<>();
        for (int i : numbers) {
            System.out.print(i+" ");
            nums.add(i);
        }
//        Collections.sort(nums);
        int n = 8;

        Compute subtract = (a,b) -> Math.abs(a-b);
        nums.sort((o1, o2) -> {
            int dist1 = subtract.compute(o1, n);
            int dist2 = subtract.compute(o2, n);
            return Integer.compare(dist1, dist2);
        });
        Compute add = (a, b) -> a + b;
        System.out.println();
        System.out.println(add.compute(5,8));
        for (int i : nums) {
            System.out.print(i + " ");
        }

        Collections.sort(shapes); // Comparable
        System.out.println("\nPRINT BY COLOR");
        for (Shape s : shapes) {
            System.out.print(s);
            System.out.println(" Area: " + s.area());
//            System.out.println("Perimeter: " + s.perimeter());
        }
        shapes.sort(new Shape.AreaComparator());
        System.out.println("PRINT BY AREA");
        for (Shape s : shapes) {
            System.out.print(s);
            System.out.println(" Area: " + s.area());
//            System.out.println("Perimeter: " + s.perimeter());
        }
    }
}
