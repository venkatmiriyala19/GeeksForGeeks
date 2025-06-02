// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int cnt=0;
        while(n!=0){
            cnt+=n&1;
            n=n>>1;
        }
        // if(n==1) cnt++;
        return cnt;
    }
}