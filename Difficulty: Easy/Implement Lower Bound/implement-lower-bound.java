//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.lowerBound(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int ans=arr.length;
        int left=0,right=ans-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=target){
                ans=mid;
                right=mid-1;
            }else if(arr[mid]<=target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}
