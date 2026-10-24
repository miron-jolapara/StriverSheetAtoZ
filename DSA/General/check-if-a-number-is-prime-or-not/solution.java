class Solution {
    public boolean checkPrime(int num) {
        //your code goes here
        if(num == 1 || num == 0)
            return false;
        if(num > 1 && num < 4)
            return true;
        for(int i = 2; i < num; i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
}