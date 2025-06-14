// User function Template for Java

class Solution {
    static boolean isOperand(char c){
        return (c>='a' && c<='z')|| (c>='A' && c<='Z') || (c>='0' && c<='9');
    }
    static String preToPost(String exp) {
        // code here
        Stack<String> st=new Stack<>();
        exp=new StringBuilder(exp).reverse().toString();
        for(int i=0;i<exp.length();i++){
            char c=exp.charAt(i);
            if(isOperand(c)){
                st.push(String.valueOf(c));
            }
            else{
                String t1=st.pop();
                String t2=st.pop();
                String ans=t1+t2+c;
                st.push(ans);
            }
        }
        return st.pop();
    }
}
