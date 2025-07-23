class Solution {

    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here
        int n= arr.length;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++){
            // if(!set.isEmpty() && set.contains(arr[i]-1)){
            //     len++;
            // }
            // else{
            //     maxLen=Math.max(len,maxLen);
            //     len=1;
            // }
            set.add(arr[i]);
        }
        int maxLen=0,len=0;
        for(int i=0;i<n;i++){
            if(set.contains(arr[i])  && !set.contains(arr[i]-1)){
                int cur = arr[i];
                while(set.contains(cur)){
                    len++;
                    cur++;
                }
                maxLen = Math.max(maxLen,len);
                len=0;
            }
        }
        return maxLen;
        
    }
}