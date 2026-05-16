class Solution {
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i)
                list.add(n/i);
            }
        }
        Collections.sort(list);
        // list.add(n);
        return list;
    }
}