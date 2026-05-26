class Solution {
    public void recBubbleSort(int[] arr,int n){
        if(n==1) return;
        boolean didSwap=false;
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                didSwap=true;
            }
        }
        if(!didSwap) return;
        recBubbleSort(arr,n-1);
    }
    public void bubbleSort(int[] arr) {
        // code here
        recBubbleSort(arr,arr.length);
    }
}