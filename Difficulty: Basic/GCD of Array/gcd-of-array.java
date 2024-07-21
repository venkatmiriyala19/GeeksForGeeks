//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int N = sc.nextInt();
                    int Arr[] = new int[N];
                    for(int i = 0;i<N;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.gcd(N,Arr));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int gcd(int N , int arr[]) 
    { 
        Arrays.sort(arr);
        int a=arr[0];
        for (int i=a;i>=1;i--){
            int temp=0;
            for(int ele:arr){
                if (ele%i==0) temp++;
            }
            if (temp==N) return i;
        }
        return 1;
       //code here.
    } 
}