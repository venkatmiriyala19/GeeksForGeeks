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

            System.out.println(ob.nthFibonacci(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

//User function Template for Java
class Solution {
    static int nthFibonacci(int n){
        if (n==0)
        return 0;
        if(n==1 || n==2)
        return 1;
        
        int f1=1;
        int f2=1;
        for(int i=3;i<=n;++i){
            int tmp=f1+f2;
            f1=f2;
            f2=tmp%1000000007;
        }
        return f2;
        // code here
    }
}