class Solution {
    int floorSqrt(int n) {
        // code here
        int low=1,high=n;
        while(low<=high){
            int mid=(low+high)/2;
            int temp=mid*mid;
            if(temp==n) return mid;
            else if(temp>n) high=mid-1;
            else low=mid+1;
        }
        return low-1;
    }
}