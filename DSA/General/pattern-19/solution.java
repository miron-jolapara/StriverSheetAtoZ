class Solution {
    public void pattern19(int n) {

        // Upper half
        for(int i = 0; i < n; i++) {

            // Stars on the left
            for(int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for(int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Stars on the right
            for(int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for(int i = n - 1; i >= 0; i--) {

            // Stars on the left
            for(int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            // Spaces in the middle
            for(int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            // Stars on the right
            for(int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}