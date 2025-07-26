class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> res=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            int[] ans=new int[2];
            if(arr[i][0]<=end){
                end=Math.max(arr[i][1],end);
            }
            else{
                ans[0]=start;
                ans[1]=end;
                res.add(ans);
                start=arr[i][0];
                end=arr[i][1];
            }
        }
        int[] ans=new int[2];
        ans[0]=start;
        ans[1]=end;
        res.add(ans);
        return res;
    }
}