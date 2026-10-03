class Solution {
    public void pattern8(int n) {
        int space = 0;
        for(int i = n ; i > 0 ; i--){
            int l = 0;
            while(l < space){
                System.out.print(" ");
                l++;
            }
            space++;
            int j = 2 * i - 1;
            for(int k = 0; k < j; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}