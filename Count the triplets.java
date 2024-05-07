class Solution {
    int countTriplet(int arr[], int n) {
        Set<Integer> set=new HashSet<>();
        for (int num:arr){
            set.add(num);
        }
        int count=0;
        for (int i=0;i<n;i++){
            int sum=0;
            for (int j=i+1;j<n;j++){
                if (set.contains(arr[i]+arr[j])){
                    count++;
                }
            }
        }
        return count;
        // code here
    }
}
