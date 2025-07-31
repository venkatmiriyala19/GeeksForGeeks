class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(arr[0],1);
        for(int i=1;i<arr.length;i++){
            if(map.getOrDefault(target-arr[i],0)==1) return true;
            map.put(arr[i],1);
        }
        return false;
    }
}