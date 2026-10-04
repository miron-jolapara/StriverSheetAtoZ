class Solution {
    public void pattern14(int n) {
        for(int i = 1; i <= n; i++){    
            char alphabet = 65;
            int j = 1;
            while(j <= i){
                System.out.print(alphabet);
                alphabet++;
                j++;
            }
            System.out.println();
        }
    }
}