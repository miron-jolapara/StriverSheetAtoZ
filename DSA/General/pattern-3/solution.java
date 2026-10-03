class Solution {
    public void pattern3(int n) {
        for(int i = 0; i < n; i ++){
            int no = 1;
            int j = 0;
            while(j <= i){
                System.out.print(no);
                no++;
                j++;
            }
            System.out.println();
        }
    }
}