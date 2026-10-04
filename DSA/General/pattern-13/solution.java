class Solution {
    public void pattern13(int n) {
        int count = 1;
        for(int i = 1; i <= n; i++){
            int j = 1;
            while(j <= i){
                System.out.print(count + " ");
                count++;
                j++;
            }
            System.out.println();
        }
    }
}