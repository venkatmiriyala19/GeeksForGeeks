class Solution {
    public boolean subArraySum(int[] arr,int k,int mid){
        int curr=1,currSum=0;
        for(int i=0;i<arr.length;i++){
            if(currSum+arr[i]<=mid){
                currSum+=arr[i];
            }else{
                curr++;
                currSum=arr[i];
            }
        }
        return curr>k;
    }
    public int minTime(int[] arr, int k) {
        // code here
        int low=0,high=0,n=arr.length;
        for(int i=0;i<n;i++){
            low=Math.max(low,arr[i]);
            high+=arr[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(subArraySum(arr,k,mid)) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}
