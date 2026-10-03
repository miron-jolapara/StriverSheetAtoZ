class Solution {
    public void pattern7(int n) {
        int count = n-1;
        int k = 1;
        int j = 0;
        for(int i = 0; i < n; i++){
            j = 0;
            while(j < count){
                System.out.print(" ");
                j++;
            }
            j = 0;
            while(j < k){
                System.out.print("*");
                j++;
            }
            count--;
            k += 2;
            System.out.println();
        }
    }
}