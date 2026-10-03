class Solution {
    public void pattern10(int n) {
        for(int i = 1; i <= n; i++){
            int j = 1;
            while(j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
        }
        for(int i = 0; i < n-1; i++){
            int j = n - 1;
            while(j > i){
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
    }
}