class Solution {
    public int rowWithMax1s(int[][] mat) {
        int max = 0, row = -1;

        for (int i = 0; i < mat.length; i++) {
            int count = 0;

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    count++;
            }

            if (count > max) {
                max = count;
                row = i;
            }
        }

        return row;
    }
}