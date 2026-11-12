class Solution {
    public int findPages(int[] nums, int m) {
        int n = nums.length;

        if (m > n)
            return -1;

        int low = 0;
        int high = 0;

        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (possible(nums, m, mid))
                high = mid - 1;
            else
                low = mid + 1;
        }

        return low;
    }

    public boolean possible(int[] nums, int m, int maxPages) {
        int students = 1;
        int pages = 0;

        for (int num : nums) {
            if (pages + num > maxPages) {
                students++;
                pages = num;
            } else {
                pages += num;
            }
        }

        return students <= m;
    }
}