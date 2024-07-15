//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();

        while (tc-- > 0) {
            int s = sc.nextInt();
            int d = sc.nextInt();

            Solution obj = new Solution();
            String res = obj.smallestNumber(s, d);

            System.out.println(res);
        }
    }
}
// } Driver Code Ends



class Solution {
    public String smallestNumber(int s, int d) {
        int start=(int) Math.pow(10,d-1);
        int end=(int) Math.pow(10,d)-1;
        for(int i=start;i<=end;i++){
            int num=i;
            int sum=0;
            while(num!=0){
                sum+=num%10;
                num=num/10;
            }
            if (sum==s){
                StringBuilder st=new StringBuilder();
                st.append(i+" ");
                return st.toString();
            }
        }
        return "-1";
        // code here
    }
}
