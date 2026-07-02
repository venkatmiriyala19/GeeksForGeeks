class Solution {
    public long subarrayXor(int arr[], int target) {
        // code here
        int n=arr.length,res=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int xor=0;
        for(int i=0;i<n;i++){
            xor^=arr[i];
            int x=xor^target;
            if(mp.containsKey(x)){
                res+=mp.get(x);
            }
            mp.put(xor,mp.getOrDefault(xor,0)+1);
        }
        return res;
    }
}