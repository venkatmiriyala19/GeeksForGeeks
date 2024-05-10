//{ Driver Code Starts
//Initial Template for Java
import java.util.*;
import java.io.*;
class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            Solution ob = new Solution();

            System.out.println(ob.armstrongNumber(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static String armstrongNumber(int n){
        int a=n;
        int rem=0;
        int arm=0;
        while(a>0){
            rem=a%10;
            arm+=Math.pow(rem,3);
            a=a/10;
        }
        if (arm==n){
            return "Yes";
        }
        return "No";
        // code here
    }
}