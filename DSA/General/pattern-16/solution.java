class Solution {
    public void pattern16(int n) {
        char alphabet = 65;
        for(int i = 1; i <= n; i++){
            int j = 1;
            while(j <= i){
                System.out.print(alphabet);
                j++;
            }
            alphabet++;
            System.out.println();
        }
    }
}