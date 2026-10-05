class Solution {
    public int factorial(int n) {
        int fact = 1;
        if(n == 0)
            return 1;
        while(n > 0){
            fact *= n;
            n--;
        }
        return fact;

    }
}