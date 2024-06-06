//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(new Solution().max_sum(arr, n));

            t--;
        }
    }
}

// } Driver Code Ends


class Solution {
    long max_sum(int a[], int n) {
        long initial=0;
        long current=0;
        for(int i=0;i<n;i++){
            initial+=(long)i*a[i];
            current+=(long)a[i];
        }        // Your code here
        long max=initial;
        long currenty=initial;
        for(int i=1;i<n;i++){
            currenty=currenty-current+(long)n*a[i-1];
            max=Math.max(max,currenty);
        }
        return max;
    }
}
