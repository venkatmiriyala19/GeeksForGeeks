class Solution {
    // Please change the array in-place
    public void recInsertionSort(int arr[],int i,int n){
        if(n==i) return;
        for(int j=i;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }else{
                break;
            }
        }
        recInsertionSort(arr,i+1,n);
        
    }
    public void insertionSort(int arr[]) {
        // code here
      recInsertionSort(arr,1,arr.length);
    }
}