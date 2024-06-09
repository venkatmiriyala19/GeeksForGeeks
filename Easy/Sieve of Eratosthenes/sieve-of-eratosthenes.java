//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			
            Solution ob = new Solution();
            ArrayList<Integer> primes  = ob.sieveOfEratosthenes(N);
            for(int prime : primes) {
                System.out.print(prime+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java
class Solution{
    static ArrayList<Integer> sieveOfEratosthenes(int N){
        ArrayList<Integer> list=new ArrayList<Integer>();
        boolean prime[]=new boolean[N+1];
        for(int i=0;i<N+1;i++){
            prime[i]=true;
        }
        for(int p=2;p*p<=N;p++){
            if(prime[p]==true){
                for(int i=p*p;i<=N;i+=p){
                    prime[i]=false;
                }
            }
        }
        for (int i=2;i<=N;i++){
            if (prime[i]){
                list.add(i);
            }
        }
        return list;
        // code here
    }
}