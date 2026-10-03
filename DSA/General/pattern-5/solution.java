class Solution {
    public void pattern5(int n) {
        for(int i = 0; i < n; i++){
            for(int j = n-1; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}