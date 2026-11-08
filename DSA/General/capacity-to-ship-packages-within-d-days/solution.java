class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;

        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(weights, days, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public boolean possible(int[] weights, int days, int capacity) {
        int count = 1;
        int sum = 0;

        for (int weight : weights) {
            if (sum + weight > capacity) {
                count++;
                sum = weight;
            } else {
                sum += weight;
            }
        }

        return count <= days;
    }
}