class Solution {
    public int roseGarden(int n, int[] nums, int k, int m) {
        if ((long) m * k > n)
            return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int num : nums) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(nums, k, m, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public boolean possible(int[] nums, int k, int m, int day) {
        int flowers = 0;
        int bouquets = 0;

        for (int num : nums) {
            if (num <= day) {
                flowers++;

                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0;
            }
        }

        return bouquets >= m;
    }
}