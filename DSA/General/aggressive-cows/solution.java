class Solution {
    public int aggressiveCows(int[] nums, int k) {
        Arrays.sort(nums);

        int low = 1, high = nums[nums.length - 1] - nums[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(nums, k, mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public boolean possible(int[] nums, int k, int dist) {
        int cows = 1, last = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - last >= dist) {
                cows++;
                last = nums[i];
            }
        }

        return cows >= k;
    }
}