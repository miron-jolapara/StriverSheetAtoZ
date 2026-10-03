class Solution {
    public void pattern9(int n) {
        int count = n - 1;
        int k = 1;
        int j = 0;

        // Upper half
        for(int i = 0; i < n; i++) {
            j = 0;

            while(j < count) {
                System.out.print(" ");
                j++;
            }

            j = 0;

            while(j < k) {
                System.out.print("*");
                j++;
            }

            count--;
            k += 2;
            System.out.println();
        }

        // Lower half
        int space = 0;

        for(int i = n; i > 0; i--) {
            int l = 0;

            while(l < space) {
                System.out.print(" ");
                l++;
            }

            int stars = 2 * i - 1;

            for(int x = 0; x < stars; x++) {
                System.out.print("*");
            }

            space++;
            System.out.println();
        }
    }
}