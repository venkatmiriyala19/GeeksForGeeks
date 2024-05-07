class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        int sum=0;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            
            while(sum>s){
                sum-=arr[i];
                i++;
            }
            
            if (sum==s && i<=j){
                list.add(i+1);
                list.add(j+1);
                return list;
            }
        }
        list.add(-1);
        return list;
        // Your code here
    }
}
