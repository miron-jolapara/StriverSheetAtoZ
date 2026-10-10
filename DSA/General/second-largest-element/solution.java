class Solution {
    public int secondLargestElement(int[] nums) {
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i = 1; i < nums.length; i++) {
            if(nums[i] > max) {
                secondMax = max;
                max = nums[i];
            }
            else if(nums[i] > secondMax && nums[i] < max) {
                secondMax = nums[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE)
            return -1;

        return secondMax;
    }
}