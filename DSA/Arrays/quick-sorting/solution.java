class Solution {
    public void quickSort(int arr[], int low, int high){
        if(low >= high)
            return;
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        while(i <= j){
            while( i <= high && arr[i] <= pivot)
                i++;
            while( j > low && arr[j] > pivot)
                j--;
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        quickSort(arr, low, j - 1);
        quickSort(arr, j+1, high);
    }
    public int[] quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }
}