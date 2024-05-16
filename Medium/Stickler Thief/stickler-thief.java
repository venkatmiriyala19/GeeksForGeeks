//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
 {
	public static void main (String[] args)
	 {
	  
	  //taking input using Scanner class
	  Scanner sc = new Scanner(System.in);
	  
	  //taking count of testcases
	  int t = sc.nextInt();
	  while(t-- > 0){
	      
	      //taking count of houses
	      int n = sc.nextInt();
	      int arr[] = new int[n];
	      
	      //inserting money present in 
	      //each house in the array
	      for(int i = 0; i<n; ++i)
	           arr[i] = sc.nextInt();
  	      
  	      //calling method FindMaxSum() of class solve
  	      System.out.println(new Solution().FindMaxSum(arr, n));
	 }
   }
}
// } Driver Code Ends


class Solution
{
    //Function to find the maximum money the thief can get.
    public int FindMaxSum(int arr[], int n)
    {
        for(int i=2;i<n;i++) {
            if((i-3)>=0) {
                arr[i]=arr[i]+Math.max(arr[i-2],arr[i-3]);
            } else {
                arr[i]=arr[i]+arr[i-2];
            }
        }
        return Math.max(arr[n-1],arr[n-2]);
        // int one=0;
        // int two=0;
        // for(int i=0;i<n;i++){
        //     if (i%2==0){
        //         one+=arr[i];
        //         continue;
        //     }
        //     two+=arr[i];
        // }
        // // System.out.println(one);
        // int i=0;
        // int j=0;
        // int sum=0;
        // while(i<n-2){
        //     j=i+1;
        //     if(arr[i]>arr[j]){
        //         // System.out.println(arr[i]);
        //         sum+=arr[i];
        //         i+=2;
        //     }
        //     else{
        //         // System.out.println(arr[j]);
        //         sum+=arr[j];
        //         i+=3;
        //     }
        // }
        // if(i<n)
        // // System.out.println(arr[i]);
        // sum+=arr[i];
        // else
        // sum+=arr[j];
        // // System.out.println(sum);
        // if (sum>=one && sum>=two){
        // return sum;}
        // else if(one>sum && one>two){
        //     return one;
        // }
        // else{
        // return two;}
        // Your code here
    }
}