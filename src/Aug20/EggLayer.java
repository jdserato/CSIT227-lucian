package Aug20;

public interface EggLayer extends Comparable<EggLayer> {
    default int layEggs() {
        return 12;
    }

    @Override
    default int compareTo(EggLayer o){
        return Integer.compare(this.layEggs(), o.layEggs());
    }
}
