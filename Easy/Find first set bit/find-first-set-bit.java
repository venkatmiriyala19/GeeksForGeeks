//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
        String rep=Integer.toBinaryString(n);
        // System.out.println(rep);
        // String rep=""+binrep;
        for(int i=rep.length()-1;i>=0;i--){
            if (rep.charAt(i)=='1'){
                return (rep.length()-i);
            }
        }
        return 0;
        // Your code here
            
    }
}