class Solution {
    public long factorial(int n) {
        long fac = 1;
        while(n >= 1){
            fac *= (long)n;
            n--;
        }
        return fac;
    }
}