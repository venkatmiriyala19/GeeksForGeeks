//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        int charArr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            charArr[ch-'a']++;
        }
        int x=0;
        int y=0;
        for(int i=0;i<26;i++){
            if(charArr[i]!=0 && charArr[i]%2==0 && (i+1)%2==0) x++;
            else if(charArr[i]%2!=0 && (i+1)%2!=0) y++;
        }
        return ((x+y)&1)==1?"ODD":"EVEN";
        // code here
    }
}
