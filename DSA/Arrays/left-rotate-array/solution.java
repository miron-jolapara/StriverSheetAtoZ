class Solution {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        if (k == 0) return;

        int[] result = new int[n];

        System.arraycopy(nums, k, result, 0, n - k);
        System.arraycopy(nums, 0, result, n - k, k);
        System.arraycopy(result, 0, nums, 0, n);
    }
}