// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int wt=0,rs=0;
        for(int i=0;i<bt.length-1;i++){
            wt+=rs;
            rs+=bt[i];
            
            // System.out.println(wt);
        }
        wt+=rs;
        int res=wt/bt.length;
        return res;
    }
}
