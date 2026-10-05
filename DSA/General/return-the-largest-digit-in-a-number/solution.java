class Solution {
    public int largestDigit(int n) {
        int temp;
        int curr;
        temp = n % 10;
        n /= 10;
        while(n > 0){
            curr = n % 10;
            n /= 10;
            if(curr > temp)
                temp = curr;
        }
        return temp;
    }
}