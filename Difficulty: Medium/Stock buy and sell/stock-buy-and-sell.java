class Solution {
    int f(int ind,int buy,int n,int values[],int dp[][]){
        if(ind==n) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int profit=0;
        if(buy==1){
            profit=Math.max(-values[ind]+f(ind+1,0,n,values,dp),
                            0+f(ind+1,1,n,values,dp));
        }else{
            profit=Math.max(values[ind]+f(ind+1,1,n,values,dp),
                            0+f(ind+1,0,n,values,dp));
        }
        return dp[ind][buy]=profit;
    }
    int stockBuySell(int arr[]) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return f(0,1,n,arr,dp);
    }
}
