//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.largestPrimeFactor(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static long largestPrimeFactor(int N) {
        // code here
        int maxPrime = Integer.MIN_VALUE;
        while(N%2 == 0){
            N = N/2;
            maxPrime = 2;
        }
        for(int i = 3; i <= Math.sqrt(N); i+=2){
            while(N%i == 0){
                N = N / i;
                maxPrime = i;
            }
        }
        if(N > 2){
            maxPrime = N;
        }
        return maxPrime;
    }

}