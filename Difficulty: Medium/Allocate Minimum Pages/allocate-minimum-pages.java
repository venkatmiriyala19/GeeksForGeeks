class Solution {
    public int students(int[] arr,long pages){
        int std=1,pagesStd=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]+pagesStd<=pages){
                pagesStd+=arr[i];
            }else{
                std+=1;
                pagesStd=arr[i];
            }
        }
        
        return std;
    }
    public int findPages(int[] arr, int k) {
        // code here
        if(k>arr.length) return -1;
        long low=Integer.MIN_VALUE,high=0;
        for(int i=0;i<arr.length;i++){
            low=Math.max(arr[i],low);
            high+=arr[i];
        }
        while(low<=high){
            long mid=(low+high)/2;
            int std=students(arr,mid);
            if(std<=k) high=mid-1;
            else low=mid+1;
        }
        return (int)low;
        
    }
}