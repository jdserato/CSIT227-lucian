package PvZ;

public class Sunflower extends Plant implements SunProducer{
    public Sunflower() {
        super(50);
    }

    @Override
    public int produceSun() {
        return 25;
    }
}
