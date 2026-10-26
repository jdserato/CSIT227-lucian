package Sept10;

import java.util.Comparator;

public class CloseToNumComparator implements Comparator<Integer> {
    int n;

    CloseToNumComparator(int n) {
        this.n = n;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        // if o1 is closer to 5, return -1
        int dist_o1 = Math.abs(n - o1);
        int dist_o2 = Math.abs(n - o2);
        return Integer.compare(dist_o1, dist_o2);
        // if same, 0
        // if o2 is closer to 5, return 1
    }
}
