package PvZ;

public class SunShroom extends Mushroom implements SunProducer{
    boolean grown;

    public SunShroom() {
        super(25);
        grown = false;
    }

    public void setGrown() {
        this.grown = true;
    }


    @Override
    public int produceSun() {
        if (!grown) {
            return 15;
        }
        return 25;
    }
}
