// User function Template for Java
class Solution {
    public static int[] productExceptSelf(int arr[]) {
        // code here
        int zeroes=0,prod=1,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes+=1;
            }
            else{
                prod*=arr[i];
            }
        }
        int[] ans=new int[n];
        if(zeroes==1){
            for(int i=0;i<n;i++){
                if(arr[i]==0) ans[i]=prod;
                else arr[i]=0;
            }
        }else if(zeroes>1){
            Arrays.fill(ans,0);
        }else{
            for(int i=0;i<n;i++){
                ans[i]=prod/arr[i];
            }
        }
        return ans;
    }
}
