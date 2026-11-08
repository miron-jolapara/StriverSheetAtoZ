class Solution {
    public int paint(int A, int B, int[] C) {
        long low = 0;
        long high = 0;

        for (int num : C) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (possible(C, A, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return (int) ((low * B) % 10000003);
    }

    public boolean possible(int[] C, int A, long max) {
        int painters = 1;
        long sum = 0;

        for (int num : C) {
            if (sum + num > max) {
                painters++;
                sum = num;
            } else {
                sum += num;
            }

            if (painters > A)
                return false;
        }

        return true;
    }
}