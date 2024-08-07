//{ Driver Code Starts
//Initial Template for Java


/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    //taking total number of elements
		    int n=sc.nextInt();
		    
		    //calling printFibb() method
		    long[] res = new Solution().printFibb(n);
		    
		    //printing the elements of the array
		    for (int i = 0; i < res.length; i++)
		        System.out.print (res[i]+" ");
		    System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        long[] fib=new long[n];
        if(n==1){
            fib[0]=1;
            return fib;
        }
        
     
        long fib1=1;
        long fib2=1;
        
        fib[0]=fib1;
        fib[1]=fib2;
        if (n==2){
            return fib;
        }
        for(int i=2;i<n;i++){
            long fib3=fib1+fib2;
            fib[i]=fib3;
            fib1=fib2;
            fib2=fib3;
        }
        return fib;
        //Your code here
    }
}