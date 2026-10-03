class Solution {
    public void pattern12(int n) {
        int spaces = n * 2 - 2;
        for(int i = 1; i <= n; i++){
            int j = 1;
            while(j <= i){
                System.out.print(j);
                j++;
            }
            for(int k = 0; k < spaces; k++){
                System.out.print(" ");
            }
            spaces -= 2;
            int x = 1;
            while(x <= i){
                j--;
                System.out.print(j);
                x++;
            }
            System.out.println();
        }
    }
}