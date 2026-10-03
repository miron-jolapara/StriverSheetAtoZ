class Solution {
    public void pattern6(int n) {
        for(int i = 0; i < n; i++){
            int no = 1;
            int j = n;
            while(j > i){
                System.out.print(no);
                no++;
                j--;
            }
            System.out.println();
        }
    }
}