

class Solution {
    public int[] AllPrimeFactors(int N) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        int i=2;
        while(i*i<=N){
            if(N%i==0){
                arr.add(i);
                while(N%i==0){
                    N=N/i;
                }
            }
            i++;
        }
        if(N>1){
            arr.add(N);
        }
        int[] res=new int[arr.size()];
        for(int j=0;j<arr.size();j++){
            res[j]=arr.get(j);
        }
        return res;
    }
}