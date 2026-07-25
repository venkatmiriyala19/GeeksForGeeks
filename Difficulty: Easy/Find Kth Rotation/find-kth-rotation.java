class Solution {
    public int findKRotation(int nums[]) {
        // Code here
        int low=0,high=nums.length-1;
        int min=nums[low];
        int ind=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid]){
                if(nums[low]<min){
                    min=nums[low];
                    ind=low;
                }
                low=mid+1;
            }else{
                if(nums[mid]<min){
                    min=nums[mid];
                    ind=mid;
                }
                high=mid-1;
            }
        }
        return ind;
    }
}