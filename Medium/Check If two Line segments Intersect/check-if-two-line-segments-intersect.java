//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int p1[] = new int[2];
            int q1[] = new int[2];
            int p2[] = new int[2];
            int q2[] = new int[2];
            String S1[] = read.readLine().split(" ");
            p1[0] = Integer.parseInt(S1[0]);
            p1[1] = Integer.parseInt(S1[1]);
            q1[0] = Integer.parseInt(S1[2]);
            q1[1] = Integer.parseInt(S1[3]);
            String S2[] = read.readLine().split(" ");
            p2[0] = Integer.parseInt(S2[0]);
            p2[1] = Integer.parseInt(S2[1]);
            q2[0] = Integer.parseInt(S2[2]);
            q2[1] = Integer.parseInt(S2[3]);
            Solution ob = new Solution();
            String ans = ob.doIntersect(p1, q1, p2, q2);
            // if(ans)
            System.out.println(ans);
            // else
            // System.out.println("false");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String doIntersect(int[] point1, int[] point2, int[] point3, int[] point4) {
        int orientation1 = findOrientation(point1, point2, point3);
        int orientation2 = findOrientation(point1, point2, point4);
        int orientation3 = findOrientation(point3, point4, point1);
        int orientation4 = findOrientation(point3, point4, point2);

        if (orientation1 != orientation2 && orientation3 != orientation4) {
            return "true";
        }

        if (orientation1 == 0 && isOnSegment(point1, point3, point2)) return "true";
        if (orientation2 == 0 && isOnSegment(point1, point4, point2)) return "true";
        if (orientation3 == 0 && isOnSegment(point3, point1, point4)) return "true";
        if (orientation4 == 0 && isOnSegment(point3, point2, point4)) return "true";

        return "false";
    }
    
    int findOrientation(int[] firstPoint, int[] secondPoint, int[] thirdPoint) {
        long crossProduct = (long)(secondPoint[1] - firstPoint[1]) * (thirdPoint[0] - secondPoint[0]) - 
                            (long)(secondPoint[0] - firstPoint[0]) * (thirdPoint[1] - secondPoint[1]);
        if (crossProduct == 0) return 0;
        return (crossProduct > 0) ? 1 : 2;
    }

    boolean isOnSegment(int[] firstPoint, int[] secondPoint, int[] thirdPoint) {
        return (secondPoint[0] <= Math.max(firstPoint[0], thirdPoint[0]) && 
                secondPoint[0] >= Math.min(firstPoint[0], thirdPoint[0]) &&
                secondPoint[1] <= Math.max(firstPoint[1], thirdPoint[1]) && 
                secondPoint[1] >= Math.min(firstPoint[1], thirdPoint[1]));
    }
}