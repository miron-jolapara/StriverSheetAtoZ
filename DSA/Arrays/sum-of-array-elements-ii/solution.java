class Solution {
    public int arraySum(int[] nums) {
        //your code goes here
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}