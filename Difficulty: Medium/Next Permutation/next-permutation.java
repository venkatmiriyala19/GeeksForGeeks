class Solution {
    void nextPermutation(int[] arr) {
        // code here
        int ind=-1;
        int n=arr.length;
        for(int i=n-2;i>=0;i--){
           if(arr[i]<arr[i+1]){
               ind=i;
               break;
           }
        }
        if(ind==-1){
            int left=0,right=n-1;
            while(left<=right){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                right--;left++;
            }
            return ;
        }
        for(int i=n-1;i>ind;i--){
            if(arr[ind]<arr[i]){
                int temp=arr[ind];
                arr[ind]=arr[i];
                arr[i]=temp;
                break;
            }
        }
        int left=ind+1;
        int right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;right--;
        }
    }
}