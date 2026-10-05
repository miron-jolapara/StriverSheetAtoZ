class Solution {
    public int countOddDigit(int n) {
        int count = 0;
        if(n == 0)
            return 0;
        while(n > 0){
            if( n % 2 != 0)
                count++;
            n /= 10;
        }
        return count;
    }
}