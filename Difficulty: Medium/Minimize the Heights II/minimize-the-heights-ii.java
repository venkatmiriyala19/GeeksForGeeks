// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        
        int result=arr[n-1]-arr[0];
        int smallest=arr[0]+k;
        int largest=arr[n-1]-k;
        
        for(int i=0;i<n-1;i++){
            int minHeight=Math.min(smallest,arr[i+1]-k);
            int maxHeight=Math.max(largest,arr[i]+k);
            
            if(minHeight<0) continue;
            
            result=Math.min(result,maxHeight-minHeight);
            
        }
        return result;
    }
}
