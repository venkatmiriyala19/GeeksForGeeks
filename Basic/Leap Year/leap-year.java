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
            System.out.println(ob.isLeap(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int isLeap(int N){
        if(N%100!=0 && N%4==0){
            return 1;
        }
        else if(N%400==0){
            return 1;
        }
        return 0;
        //code here
    }
}