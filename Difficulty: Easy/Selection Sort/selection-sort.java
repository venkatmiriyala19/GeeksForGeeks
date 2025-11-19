class Solution {
    void selectionSort(int[] arr) {
        // code here
        for(int i=0;i<arr.length;i++){
            int mini=arr[i];
            int ind=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<mini){
                    mini=arr[j];
                    ind=j;
                }
            }
            if(mini!=arr[i])
            {   int temp=arr[i];
                arr[i]=mini;
                arr[ind]=temp;
            }
            
        }
    }
}