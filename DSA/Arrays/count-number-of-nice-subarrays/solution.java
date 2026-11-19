class Solution {
    public int numberOfOddSubarrays(int[] nums, int k) {
        return atMost(nums, k) - atMost(nums, k - 1);
    }

    public int atMost(int[] nums, int k) {
        int left = 0, count = 0, odd = 0;

        for (int right = 0; right < nums.length; right++) {
            odd += nums[right] % 2;

            while (odd > k) {
                odd -= nums[left] % 2;
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}