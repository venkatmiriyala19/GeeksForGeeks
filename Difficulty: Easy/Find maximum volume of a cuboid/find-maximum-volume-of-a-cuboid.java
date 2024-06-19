//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            String arr[] = read.readLine().trim().split("\\s+");
            double perimeter = Double.parseDouble(arr[0]);
            double area = Double.parseDouble(arr[1]);

            Solution ob = new Solution();
            double ans = ob.maxVolume(perimeter, area);
            System.out.println(String.format("%.2f", ans));
        }
    }
}
// } Driver Code Ends




// User function Template for Java

class Solution {

    double maxVolume(double perimeter, double area) {
        // code here
        double sqrtTerm=Math.sqrt(perimeter*perimeter -24 *area);
        double d1=(perimeter-sqrtTerm)/12.0;
        double d2=(perimeter/4.0)-2*d1;
        double volume=Math.pow(d1,2)*d2;
        return Math.round(volume*100.0)/100.0;
    }
}