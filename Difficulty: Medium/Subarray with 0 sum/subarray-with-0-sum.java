class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int sum=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(set.contains(sum) || sum==0) return true;
            set.add(sum);
        }
        return false;
    }
}