class Solution {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        int[] visited=new int[arr.length+1];
        Arrays.fill(visited,-1);
        for(int i=0;i<arr.length;i++){
            visited[arr[i]]++;
        }
        for(int i=0;i<arr.length+1;i++){
            if(visited[i]>0){
                res.add(i);
            }
        }
        return res;
    }
}