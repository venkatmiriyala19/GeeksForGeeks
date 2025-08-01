class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        // code here
        int n=mat.length;
        int m=mat[0].length;
        int left=0,right=m-1,top=0,bottom=n-1;
        ArrayList<Integer> arr=new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                arr.add(mat[top][i]);
            }top++;
            for(int i=top;i<=bottom;i++){
                arr.add(mat[i][right]);
            }right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    arr.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    arr.add(mat[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}
