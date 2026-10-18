class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int i = 0;
        int j = nums.length - 1;
        int floor = -1;
        int ceil = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == x) {
                floor = nums[mid];
                ceil = nums[mid];
                break;
            } 
            else if (nums[mid] < x) {
                floor = nums[mid];
                i = mid + 1;
            } 
            else {
                ceil = nums[mid];
                j = mid - 1;
            }
        }

        return new int[]{floor, ceil};
    }
}