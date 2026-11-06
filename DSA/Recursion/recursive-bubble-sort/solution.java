class Solution {
    public void bubble(int[] arr, int n) {
        if (n <= 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        bubble(arr, n - 1);
    }

    public int[] bubbleSort(int[] nums) {
        bubble(nums, nums.length);
        return nums;
    }
}