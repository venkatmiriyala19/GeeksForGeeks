class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        long msf=Integer.MIN_VALUE;
        long meh=0;
        for(int i=0;i<n;i++){
            meh+=arr[i];
            if (meh<arr[i]){
                meh=arr[i];
            }
            if (msf<meh){
                msf=meh;
            }
        }
        return msf;
        
        // Your code here
        
    }
    
}
