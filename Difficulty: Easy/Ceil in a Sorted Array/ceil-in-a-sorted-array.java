class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int lastIndex=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=x){
                lastIndex=mid;
                high=mid-1;
            }else low=mid+1;
        }
        return lastIndex;
    }
}
