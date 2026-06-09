class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int max=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=max){
                res.add(arr[i]);
                max=arr[i];
            }
        }
        Collections.reverse(res);
        return res;
    }
}
