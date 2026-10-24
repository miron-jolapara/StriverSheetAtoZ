class Solution {
    public int[] reverseArray(int[] nums) {
        int len = nums.length;
        int j = len - 1;
        int[] reverse = new int[len];
        int i;

        for(i = 0; i < len; i ++){
            reverse[i] = nums[j];
            j--;
        }

        return reverse;
    }
}