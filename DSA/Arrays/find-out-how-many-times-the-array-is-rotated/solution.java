class Solution {
    public int findKRotation(ArrayList<Integer> nums) {
        int low = 0;
        int len = nums.size();
        int high = len - 1;
        while(low < high){
            int mid = (low + high)/2;
            if(nums.get(mid) > nums.get(high)){
                low = mid + 1;
            }
            else
                high = mid;
        }
        return low;
    }
}