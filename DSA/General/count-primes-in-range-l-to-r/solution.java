import java.util.*;

class Solution {
    public ArrayList<Integer> primesInRange(ArrayList<int[]> queries) {
        ArrayList<Integer> result = new ArrayList<>();

        if (queries.isEmpty()) {
            return result;
        }

        int max = 0;
        for (int[] query : queries) {
            max = Math.max(max, query[1]);
        }

        // Sieve of Eratosthenes
        boolean[] isPrime = new boolean[max + 1];
        Arrays.fill(isPrime, true);

        if (max >= 0) isPrime[0] = false;
        if (max >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= max; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= max; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Prefix sum of prime counts
        int[] prefix = new int[max + 1];

        for (int i = 1; i <= max; i++) {
            prefix[i] = prefix[i - 1];
            if (isPrime[i]) {
                prefix[i]++;
            }
        }

        // Answer each query [L, R]
        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            if (l <= 0) {
                result.add(prefix[r]);
            } else {
                result.add(prefix[r] - prefix[l - 1]);
            }
        }

        return result;
    }
}