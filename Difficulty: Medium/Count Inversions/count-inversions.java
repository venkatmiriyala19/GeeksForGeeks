class Solution {
    static int count=0;
    static void mergeSort(int[] arr,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high){
        int left=low;
        int right=mid+1;
        ArrayList<Integer> temp=new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left++]);
            }else{
                count+=mid-left+1;
                temp.add(arr[right++]);
            }
        }
         while(left<=mid){
             temp.add(arr[left++]);
         }
         while(right<=high){
            temp.add(arr[right++]);
         }
         for(int i=low;i<=high;i++){
             arr[i]=temp.get(i-low);
         }
    }
    static int inversionCount(int arr[]) {
        // Code Here
        count=0;
        mergeSort(arr,0,arr.length-1);
        return count;
        
    }
}