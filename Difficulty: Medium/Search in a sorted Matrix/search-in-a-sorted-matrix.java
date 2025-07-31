class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        for(int i=0;i<mat.length;i++){
            int len=mat[i].length;
            if(mat[i][0]<=x && mat[i][len-1]>=x){
                int low=0,high=len;
                while(low<=high){
                    int mid=(low+high)/2;
                    if(mat[i][mid]==x) return true;
                    if(mat[i][mid]<x) low=mid+1;
                    else high=mid-1;
                }
            }
        }
        return false;
    }
}
