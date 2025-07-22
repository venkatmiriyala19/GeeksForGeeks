class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        // K = ALEN+BLEN
        //blements sort 
        int i=a.length-1,j=0;
        while(i>=0 && j<b.length && a[i]>b[j]){
           
                int temp=b[j];
                b[j]=a[i];
                a[i]=temp;
            
            i--;j++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}
