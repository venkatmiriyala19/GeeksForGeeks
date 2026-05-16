// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev=0;
        while(n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        return rev;
    }
}