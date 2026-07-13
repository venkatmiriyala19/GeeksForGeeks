class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int lastIndex=arr.length;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            // if(arr[mid]==target) return mid;
            if(arr[mid]>=target){
                lastIndex=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return lastIndex;
    }
}
