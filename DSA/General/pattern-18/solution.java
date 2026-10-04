class Solution {
    public void pattern18(int n) {
        char alphabet = 64;
        alphabet += (char)n;

        for(int i = 0; i < n; i++) {
            char current = alphabet;
            current -= (char)i;

            int j = 0;

            while(j <= i) {
                System.out.print(current + " ");
                current++;
                j++;
            }

            System.out.println();
        }
    }
}