class Solution {
    int maxProduct(int[] arr) {
        // code here
        int prefix=Integer.MIN_VALUE;
        int suffix=Integer.MIN_VALUE;
        
        int prod1=1,prod2=1;
    int j=arr.length-1;
        for(int i=0;i<arr.length;i++){
            prod1*=arr[i];
            prod2*=arr[j--];
            prefix=Math.max(prefix,prod1);
            suffix=Math.max(suffix,prod2);
            
            if(prod1==0) prod1=1;
            if(prod2==0) prod2=1;
        }
        return Math.max(prefix,suffix);
        
    }
}