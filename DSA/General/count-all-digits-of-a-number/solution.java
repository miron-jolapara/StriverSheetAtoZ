class Solution {
    public int countDigit(int n) {
        int copy = n;
        int count = 0;
        if(n == 0)
            return 1;
        while(copy > 0){
            copy /= 10;
            count++;
        }
        return count;
        
    }
}