// User function Template for Java

class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
        int min=prices[0],res=0;
        for(int i=1;i<prices.length;i++){
            min=Math.min(min,prices[i]);
            res=Math.max(res,prices[i]-min);
        }
        return res;
    }
}