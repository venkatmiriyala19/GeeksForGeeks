// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        StringBuilder sb=new StringBuilder(s);
        String res=sb.reverse().toString();
        return res;
    }
}