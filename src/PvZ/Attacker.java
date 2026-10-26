package PvZ;

public interface Attacker {
    default int attack() {
        return 20;
    }
}
