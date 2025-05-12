//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String[] valueInput = br.readLine().trim().split(" ");
            int[] values = new int[valueInput.length];
            for (int i = 0; i < valueInput.length; i++) {
                values[i] = Integer.parseInt(valueInput[i]);
            }
            String[] weightInput = br.readLine().trim().split(" ");
            int[] weights = new int[weightInput.length];
            for (int i = 0; i < weightInput.length; i++) {
                weights[i] = Integer.parseInt(weightInput[i]);
            }
            int w = Integer.parseInt(br.readLine().trim());
            System.out.println(String.format(
                "%.6f", new Solution().fractionalKnapsack(values, weights, w)));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends

class Pair{
    int val,weight;
    public Pair(int val,int weight){
        this.val=val;
        this.weight=weight;
    }
}
class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        Pair[] p=new Pair[values.length];
        
        for(int i=0;i<values.length;i++){
            p[i]=new Pair(values[i],weights[i]);
        }
        double total=0;
        Arrays.sort(p,(a,b)->Double.compare((double)b.val/b.weight,(double)a.val/a.weight));
        
        for(int i=0;i<p.length;i++){
            if(W>p[i].weight){
                total+=p[i].val;
                W-=p[i].weight;
            }
            else{
                total+=((double)p[i].val/((double)p[i].weight)*W);
                break;
            }
        }
        return total;
        
    }
}