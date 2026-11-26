class Solution {
    public int LIS(int[] nums) {
        int[] arr = new int[nums.length];
        int len = 0;

        for (int num : nums) {
            int low = 0, high = len;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (arr[mid] < num)
                    low = mid + 1;
                else
                    high = mid;
            }

            arr[low] = num;

            if (low == len)
                len++;
        }

        return len;
    }
}