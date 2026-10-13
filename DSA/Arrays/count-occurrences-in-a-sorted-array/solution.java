class Solution {
    public int countOccurrences(int[] arr, int target) {
        int index = -1;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                index = i;
                break;
            }
        }

        if(index == -1)
            return 0;

        while(index < arr.length && arr[index] == target) {
            count++;
            index++;
        }

        return count;
    }
}