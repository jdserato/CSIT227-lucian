package PvZ;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Plant> plants = Arrays.asList(new PuffShroom(), new SunShroom(), new Repeater(), new Sunflower(), new Peashooter());
        plants.sort(new Plant.TypeComparator());
        for (Plant p : plants) {
            System.out.println(p);
        }
    }
}
