class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=arr[0];
        int sec=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                sec=max;
                max=arr[i];
            }
            else if(arr[i]>sec && arr[i]<max){
                sec=arr[i];
            }
        }
        return sec;
    }
}