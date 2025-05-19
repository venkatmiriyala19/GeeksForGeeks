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
            int ans = sln.countFreq(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int low=0,high=arr.length-1;
        int cnt=0;
        int first=0;int second=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) {first=mid;
             high=mid-1;}
             else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        low=0;high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target) {second=mid; low=mid+1;}
            else if(arr[mid]<target) low=mid+1;
            else high=mid-1;
        }
        return second-first+1;
    }
}
