class Solution {
    public void pattern17(int n) {

        for(int i = 1; i <= n; i++) {

            // Spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Increasing alphabets
            char alphabet = 'A';

            for(int j = 1; j <= i; j++) {
                System.out.print(alphabet);
                alphabet++;
            }

            // Decreasing alphabets
            alphabet -= 2;

            for(int j = 1; j < i; j++) {
                System.out.print(alphabet);
                alphabet--;
            }

            System.out.println();
        }
    }
}