class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(set.add(a[i])){
                res.add(a[i]);
            }
        }
        for(int i=0;i<b.length;i++){
            if(set.add(b[i])){
                res.add(b[i]);
            }
        }
        return res;
    }
}