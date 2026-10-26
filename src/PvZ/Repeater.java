package PvZ;

public class Repeater extends Plant implements Attacker{
    public Repeater() {
        super(200);
    }

    @Override
    public int attack() {
        return Attacker.super.attack()*2;
    }
}
