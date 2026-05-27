class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low>=high) return;
        int pi=partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr,pi+1,high);
    }

    private int partition(int[] arr, int low, int high) {
        // code here
        int pivot=arr[low];
        int i=low,j=high;
        while(i<j){
            while( i<=j&&arr[i]<=pivot ){
                i++;
            }
            while( i<=j&&arr[j]>=pivot){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        arr[low]=arr[j];
        arr[j]=pivot;
        return j;
    }
}