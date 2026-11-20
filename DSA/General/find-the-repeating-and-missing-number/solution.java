class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        long n = nums.length;
        long sum = 0, sumSq = 0;

        for (int num : nums) {
            sum += num;
            sumSq += (long) num * num;
        }

        long expectedSum = n * (n + 1) / 2;
        long expectedSq = n * (n + 1) * (2 * n + 1) / 6;

        long diff = sum - expectedSum;       // repeating - missing
        long sqDiff = sumSq - expectedSq;   // repeating² - missing²

        long sumRM = sqDiff / diff;         // repeating + missing

        int repeating = (int) ((diff + sumRM) / 2);
        int missing = (int) (sumRM - repeating);

        return new int[]{repeating, missing};
    }
}