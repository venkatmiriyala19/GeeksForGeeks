class Solution {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int mid=0,low=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        
    }
}