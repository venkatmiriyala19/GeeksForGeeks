//{ Driver Code Starts
import java.io.*;
import java.util.*;

class IntArray {
    public static int[] input(BufferedReader br, int n) throws IOException {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);

        return a;
    }

    public static void print(int[] a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<Integer> a) {
        for (int e : a) System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            int n;
            n = Integer.parseInt(br.readLine());

            int x;
            x = Integer.parseInt(br.readLine());

            int y;
            y = Integer.parseInt(br.readLine());

            int[] arr = IntArray.input(br, n);

            int[] brr = IntArray.input(br, n);

            Solution obj = new Solution();
            long res = obj.maxTip(n, x, y, arr, brr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        long sum=0;
        int[][] diffs=new int[n][3];
        for(int k=0;k<n;k++){
            diffs[k][0]=Math.abs(arr[k]-brr[k]);
            diffs[k][1]=arr[k];
            diffs[k][2]=brr[k];
        }
        Arrays.sort(diffs,(a,b)->b[0]-a[0]);
        int i=0;
        int j=0;
        for(int k=0;k<n;k++){
            int tipA=diffs[k][1];
            int tipB=diffs[k][2];
            if (tipA>=tipB){
                if(i<x){
                    sum+=tipA;
                    i++;
                }
                else{
                    sum+=tipB;
                    j++;
                }
            }
            else{
                if(j<y){
                    sum+=tipB;
                    j++;
                }
                else{
                    sum+=tipA;
                    i++;
            }
        }
        }
        return sum;
        // code here
    }
}
