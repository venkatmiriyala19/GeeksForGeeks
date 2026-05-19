import java.util.Scanner;

class GFG {
    private static void rec(int n){
        if(n==0){
            return;
        }else{
            System.out.print("GFG"+" ");
            rec(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        rec(n);
        
    }
}