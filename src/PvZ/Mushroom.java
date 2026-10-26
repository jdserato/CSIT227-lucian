package PvZ;

public abstract class Mushroom extends Plant {
    public Mushroom(int sunCost, double recharge, int hp) {
        super(sunCost, recharge, hp);
    }

    public Mushroom(int sunCost) {
        super(sunCost);
    }
}
