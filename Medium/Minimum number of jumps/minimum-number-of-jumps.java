//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        int max = 0;
        int jumps = 0;
        int maxRange = 0;
        int n = arr.length;
        
        if(n == 1){
            return 0;
        }
        
        for(int i=0; i<n; i++){
            max = Math.max(max, i + arr[i]);
            if(maxRange == i){
                maxRange = max;
                
                jumps++;
                
                if(maxRange >= n-1){
                    return jumps;
                }
            }
        }
        return -1;
        // your code here
    }
}