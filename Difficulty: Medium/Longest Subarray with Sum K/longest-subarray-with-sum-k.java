// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        int prefixSum=0,len=0;
        for(int i=0;i<arr.length;i++){
            prefixSum+=arr[i];
            if(prefixSum==k ){
                len=i+1;
            }
            if(mp.containsKey(prefixSum-k)){
                // System.out.println(i);
                len=Math.max(len,i-mp.getOrDefault(prefixSum-k,0));
            }
            mp.putIfAbsent(prefixSum,i);
        }
        return len;
    }
}
