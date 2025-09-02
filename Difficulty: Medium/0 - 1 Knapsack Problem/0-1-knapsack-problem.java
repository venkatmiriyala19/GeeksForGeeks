class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        // code here
        int[] dp=new int[W+1];
        
        for(int i=0;i<wt.length;i++){
            for(int j=W;j>=wt[i];j--){
                dp[j]=Math.max(dp[j],dp[j-wt[i]]+val[i]);
            }
        }
        return dp[W];
    }
}
