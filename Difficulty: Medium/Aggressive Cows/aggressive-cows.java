class Solution {
    public boolean isPossible(int[] arr,int mid,int k){
        int lastCow=0,cowsRemaining=k-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[lastCow]>=mid){
                cowsRemaining--;
                lastCow=i;
            }
        }
        return cowsRemaining<=0;
        
    }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int low=1,high=arr[arr.length-1];
        while(low<=high){
            int mid=(low+high)/2;
            boolean possible=isPossible(arr,mid,k);
            if(possible){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low-1;
    }
}