class Solution {
    public void pattern15(int n) {
        for(int i = n; i > 0; i--){
            char alphabet = 65;
            int j = 1;
            while(j <= i){
                System.out.print(alphabet);
                j++;
                alphabet++;
            }
            System.out.println();
        }
    }
}