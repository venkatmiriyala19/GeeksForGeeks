//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int n = a1.length;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }

            String line2 = br.readLine();
            String[] a2 = line2.trim().split("\\s+");
            n = a2.length;
            int b[] = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = Integer.parseInt(a2[i]);
            }

            int ans = new Solution().maxMeetings(a, b);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    static class Meetings{
        int start,end;
        Meetings(int start,int end){
            this.start=start;
            this.end=end;
        }
    }
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n=end.length;
        Meetings[] arr=new Meetings[n];
        for(int i=0;i<n;i++) arr[i]= new Meetings(start[i],end[i]);
        Arrays.sort(arr,(a,b)->a.end-b.end);
        int cnt=1;
        int prevEnd=arr[0].end;
        for(int i=1;i<n;i++){
            if(arr[i].start>prevEnd){
                cnt++;
                prevEnd=arr[i].end;
            }
        }
        return cnt;
    }
}
