class Solution {
    public void pattern4(int n) {
        int no = 1;
        for(int i = 0; i < n; i++){
            int j = 0;
            while(j <= i){
                System.out.print(no);
                j++;
            }
            no++;
            System.out.println();
        }
    }
}