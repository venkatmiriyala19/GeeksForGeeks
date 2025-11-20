class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int partitionIndex=partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
        
    }

    private int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low,j=high-1;
        while(i<=j){
            while( i<=j && arr[i]<=pivot ){
                i++;
            }
            while(j>=i&& arr[j]>=pivot  ){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;j--;
            }
        }
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;
        
        // code here
    }
}