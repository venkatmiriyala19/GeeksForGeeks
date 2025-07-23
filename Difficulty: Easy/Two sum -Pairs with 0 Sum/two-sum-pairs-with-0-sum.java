// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        int j=arr.length-1;
        int i=0;
        int prev=-1;
        while(i<j && i<arr.length && j<arr.length){
            if(arr[i]+arr[j]==0){
                if(arr[j]==prev){i++;j--;continue;}
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i]);
                temp.add(arr[j]);
                prev=arr[j];
                res.add(temp);i++;j--;continue;
            }
            if(Math.abs(arr[i])>arr[j]){
                i++;
            }else{j--;}
            
        }
        return res;
    }
}
