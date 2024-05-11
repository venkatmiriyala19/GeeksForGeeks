//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.awt.Point; 
import java.util.Arrays; 
import java.util.Vector; 
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		findAll();
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		    
		    Arrays.sort(arr);
		    boolean flag=false;
		    for(int x:arr)
		    {
		        if(mp.containsKey(x))
		        {System.out.print(x+" ");flag=true;}
		    }
		    
		    if(flag==false)
		    System.out.print(-1);
		    System.out.println();
		}
		
		
	}
	
	
    static HashMap<Integer,Integer>mp=new HashMap<>();



// } Driver Code Ends
//User function Template for Java

//Function to find all the numbers with only 1,2 and 3 in their digits.
// static HashMap<Integer,Integer>mp=new HashMap<>();
public static void findAll()
{
    for(int i=0;i<1000000;i++){
        int number=i,flag=1;
        while(number>0){
            int digit=number%10;
            if(digit==1|| digit==2||digit==3){
                number/=10;
            }
            else{
                flag=0;
                break;
            }
        }
        if (flag==1){
            mp.put(i,1);
        }
    }
    //Your code here
}
  
      




//{ Driver Code Starts.


}
// } Driver Code Ends