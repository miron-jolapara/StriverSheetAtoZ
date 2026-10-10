class Solution {
    public void rotateArrayByOne(int[] nums) {
        int len = nums.length;

        if(len <= 1)
            return;

        int temp = nums[0];

        for(int i = 0; i < len - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[len - 1] = temp;
    }
}