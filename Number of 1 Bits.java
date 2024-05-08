class Solution {
    static int setBits(int N) {
        int c=0;
        String bin=Integer.toBinaryString(N);
        for (char ch:bin.toCharArray()){
            if (ch=='1'){
                c++;
            }
        }
        return c;
        // code here
    }
}
