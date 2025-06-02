class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        List<Integer> res=new ArrayList<>();
        a=a^b;
        b=a^b;
        a=a^b;
        res.add(a);
        res.add(b);
        return res;
    }
}