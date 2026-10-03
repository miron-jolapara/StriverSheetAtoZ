class Solution {
    public void pattern11(int n) {
        int check = 1;
        for(int i = 1; i <= n; i++){
            int j = 0;
            if(i % 2 == 0)
                check = 0;
            else
                check = 1;
            while(j < i){
                if(check % 2 == 0){
                    System.out.print("0 ");
                    check++;
                }
                else{
                    System.out.print("1 ");
                    check++;
                }
                j++;   
            }
            System.out.println();
        }
    }
}