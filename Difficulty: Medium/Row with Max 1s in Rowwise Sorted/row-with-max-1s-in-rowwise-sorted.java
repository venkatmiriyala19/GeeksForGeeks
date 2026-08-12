class Solution {
    public int rowWithMax1s(int[][] arr) {
        // code here
        int max=Integer.MIN_VALUE,ans=-1;
        for(int i=arr.length-1;i>=0;i--){
            int low=0,high=arr[i].length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(arr[i][mid]==0) low=mid+1;
                else high=mid-1;
            }
            // System.out.println(low);
            if(low<arr[i].length){
                if(arr[i].length-low>=max){
                    max=arr[i].length-low;
                    ans=i;
                }
            }
        }
        return ans;
    }
};