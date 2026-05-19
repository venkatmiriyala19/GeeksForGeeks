class Solution {
    public int[] swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        return arr;
    }
    public int[] rev(int arr[],int size,int n){
        if(n<size/2){
            arr=swap(arr,n,size-n-1);
            // System.out.print("Swapped"+" ");
            return rev(arr,size,n+1);
        }else{
            // arr=swap(arr,n,size-n-1);
            return arr;
        }
    }
    public void reverseArray(int arr[]) {
        // code here
        arr=rev(arr,arr.length,0);
    }
}