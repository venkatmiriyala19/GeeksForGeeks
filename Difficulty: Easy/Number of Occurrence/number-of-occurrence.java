class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int low=0,high=arr.length-1;
        int lastIndex=arr.length;
        int firstIndex=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                lastIndex=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
         if (lastIndex == arr.length || arr[lastIndex] != target)
            return 0;
        low=0;high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                
                high=mid-1;
            }else{
                firstIndex=mid;
                low=mid+1;
            }
        }
       
        return firstIndex-lastIndex+1;
    }
}
