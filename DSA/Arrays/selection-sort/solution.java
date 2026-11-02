class Solution {
    public int[] selectionSort(int[] arr) {
        int len = arr.length;
        for(int i = 0; i < len; i++){
            int minIndex = i;
            for(int j = i + 1; j < len; j++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }
            if(minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }
}