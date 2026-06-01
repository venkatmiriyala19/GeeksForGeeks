class Solution {
    int missingNum(int arr[]) {
        // code here
        long total=0;
        for(Integer i:arr){
            total+=i;
        }
        long n=arr.length+1;
        long exp=(n*(n+1))/2;
        return (int)(exp-total);
    }
}