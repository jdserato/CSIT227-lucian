package PvZ;

import java.util.Comparator;

public abstract class Plant implements Comparable<Plant> {
    private int sunCost;
    private double recharge;
    private int hp;

    public Plant(int sunCost, double recharge, int hp) {
        this.sunCost = sunCost;
        this.recharge = recharge;
        this.hp = hp;
    }

    public Plant(int sunCost) {
        this(sunCost, 7.5, 300);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " - " + hp + " (sun: " + sunCost + ")";
    }

    @Override
    public int compareTo(Plant o) {
        return this.sunCost - o.sunCost;
    }

    public static class TypeComparator implements Comparator<Plant> {
        @Override
        public int compare(Plant o1, Plant o2) {
            return o1.getClass().getSimpleName().toLowerCase().compareTo(o2.getClass().getSimpleName().toLowerCase());
        }
    }
}
