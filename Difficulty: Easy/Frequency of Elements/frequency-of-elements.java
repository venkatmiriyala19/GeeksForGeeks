class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        HashMap<Integer,Integer> mp=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(entry.getKey());
            temp.add(entry.getValue());
            res.add(temp);
        }
        return res;
    }
}