// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n=arr.length;
        int temp=arr[0];
        arr[0]=arr[n-1];
        for(int i=1;i<n;i++){
            int temp1=arr[i];
            arr[i]=temp;
            temp=temp1;
        }
        
    }
}