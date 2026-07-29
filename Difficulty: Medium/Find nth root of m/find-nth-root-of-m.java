class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if (m==0) return 0;
        int low=1,high=m;
        while(low<=high){
            int mid=(low+high)/2;
            double temp=Math.pow(mid,n);
            if(temp==m) return mid;
            else if(temp>m) high=mid-1;
            else low=mid+1;
            
        }
        return -1;
    }
}