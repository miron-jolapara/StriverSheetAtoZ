import java.util.*;

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, long cap) {
        int n = val.length;
        Integer[] idx = new Integer[n];

        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }

        Arrays.sort(idx, (a, b) ->
            Double.compare((double) val[b] / wt[b],
                           (double) val[a] / wt[a])
        );

        double total = 0;
        long remaining = cap;

        for (int i : idx) {
            if (remaining == 0) break;

            if (wt[i] <= remaining) {
                total += val[i];
                remaining -= wt[i];
            } else {
                total += ((double) val[i] / wt[i]) * remaining;
                remaining = 0;
            }
        }

        return total;
    }
}