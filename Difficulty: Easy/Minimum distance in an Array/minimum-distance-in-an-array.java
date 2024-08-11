//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) 
                a[i] = Integer.parseInt(str[i]);
            String[] xy = br.readLine().trim().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            Solution g = new Solution();
            System.out.println(g.minDist(a, n, x, y));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int minDist(int a[], int n, int x, int y) {
        int x_index=-1;
        int y_index=-1;
        int result=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(a[i]==x) x_index=i;
            if(a[i]==y) y_index=i;
            if(x_index!=-1 && y_index!=-1){
                result=Math.min(result,Math.abs(x_index-y_index));
            }
        }
        if (result==Integer.MAX_VALUE){
            return -1;
        }
        return result;
        // code here
    }
}