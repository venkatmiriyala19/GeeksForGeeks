//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        // code here
        long f1=1;
        long f2=1;
        long f3=f1+f2;
        if (n==1){
            return f3;
        }
        for (int i=2;i<=n;i++){
            f1=f2 %(1000000007);
            f2=f3%(1000000007);
            f3=(f1+f2)%(1000000007);
        }
        return f3;
    }
}