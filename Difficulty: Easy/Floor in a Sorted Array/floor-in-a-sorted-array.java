class Solution {
    static int findFloor(int[] arr, int x) {
        // code here
        int lastIndex=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>x) high=mid-1;
            else{
                lastIndex=mid;
                low=mid+1;
            }
        }
        return lastIndex;
    }
}
