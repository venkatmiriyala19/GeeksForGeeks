// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int i=1;
        while(i*i<=n){
                        i++;

            while(n%i==0){
                n=n/i;
            }
        }
        if(n>1){
            return n;
        }
        return i;
        
    }
}