class Solution {
    public int blackbox(int[][] mat,int x){
        int ans=0;
        for(int i=0;i<mat.length;i++){
            // if(mat[i][0]>x) return ans;
            int low=0,high=mat[i].length-1;
            while(low<=high){
                int mid=(low+high)/2;
                if(mat[i][mid]<=x)low=mid+1;
                else high=mid-1;
            }
            ans+=low;
        }
        
        return ans;
    }
    public int median(int[][] mat) {
        // code here
        int n=mat.length,m=mat[0].length;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++){
           
                low=Math.min(low,mat[i][0]);
                high=Math.max(high,mat[i][m-1]);
            
        }
        int req=(n*m)/2;
        while(low<=high){
            int mid=(low+high)/2;
            int smallerEquals=blackbox(mat,mid);
            if(smallerEquals<=req) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
}