class Solution {
    public static void print_divisors(int n) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                if(n/i!=i) arr.add(n/i);
                System.out.print(i+" ");
            }
        }
        for(int i=arr.size()-1;i>=0;i--){
            System.out.print(arr.get(i)+" ");
        }
        // System.out.print(n);
    }
}
