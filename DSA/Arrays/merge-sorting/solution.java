class Solution {
    public int[] mergeSort(int[] arr) {
        int len = arr.length;

        if (len <= 1) {
            return arr;
        }

        int mid = len / 2;

        int[] L = new int[mid];
        int[] R = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            L[i] = arr[i];
        }

        for (int i = mid; i < len; i++) {
            R[i - mid] = arr[i];
        }

        int[] leftResult = mergeSort(L);
        int[] rightResult = mergeSort(R);

        int leftLen = leftResult.length;
        int rightLen = rightResult.length;

        int[] result = new int[len];

        int i = 0, j = 0, k = 0;

        while (i < leftLen && j < rightLen) {
            if (leftResult[i] <= rightResult[j]) {
                result[k++] = leftResult[i++];
            } else {
                result[k++] = rightResult[j++];
            }
        }

        while (i < leftLen) {
            result[k++] = leftResult[i++];
        }

        while (j < rightLen) {
            result[k++] = rightResult[j++];
        }

        return result;
    }
}