//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            int matrix[][] = new int[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) matrix[i][j] = sc.nextInt();
            }
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.spirallyTraverse(matrix);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int matrix[][]) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0,col=-1;
        int direction=1;
        while(n>0&&m>0){
            for(int i=0;i<m;i++){
                col+=direction;
                ans.add(matrix[row][col]);
            }
            n--;
            for(int i=0;i<n;i++){
                row+=direction;
                ans.add(matrix[row][col]);
            }
            m--;
            direction*=-1;
        }
        return ans;
        
    }
}
