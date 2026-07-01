class Solution {
    int maxLength(int arr[]) {
        // code here
        HashMap<Integer,Integer> mp=new HashMap<>();
        int sum=0,maxi=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0){
                maxi=Math.max(maxi,i+1);
            }
            else if(mp.containsKey(sum)){
                maxi=Math.max(maxi,i-mp.get(sum));
            }else{
                mp.put(sum,i);
            }
        }
        return maxi;
    }
}