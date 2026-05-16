// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int x=n,arm=0;
        while(n!=0){
            int temp=n%10;
            arm+=Math.pow(temp,3);
            n=n/10;
        }
        return x==arm;
    }
}