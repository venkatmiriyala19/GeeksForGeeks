// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int min=Integer.MAX_VALUE;
        int ind=0;
        int low=0,high=arr.size()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr.get(low)<=arr.get(mid)){
                if(min>arr.get(low)){
                    min=arr.get(low);
                    ind=low;
                }
                low=mid+1;
            }else{
               if(min>arr.get(mid)){
                    min=arr.get(mid);
                    ind=mid;
                } 
                high=mid-1;
            }
        }
        return ind;
    }
}