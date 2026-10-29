class Solution {
    public int minBitsFlip(int start, int goal) {
        //your code goes here
        int n = start ^ goal;
        int count = 0;

        while (n != 0) {
            n &= (n - 1);
            count++;
        }

        return count;
    }
}