class Solution {
    public int NthRoot(int N, int M) {
        int low = 1;
        int high = M;
        while(low <= high){
            int mid = (low + high) / 2;
            if(Math.pow(mid , N) == M)
                return mid;
            else if(Math.pow(mid , N) < M)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
