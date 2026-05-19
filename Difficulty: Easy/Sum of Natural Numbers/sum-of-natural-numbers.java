// User function Template for Java

class Solution {
    static int nsum(int n, int result){
        if(n==0){
            return result;
        }else{
            result+=n;
            return nsum(n-1,result);
        }
    }
    static int sumOfNaturals(int n) {
        // code here
        int res=0;
        res=nsum(n,res);
        return res;
    }
};