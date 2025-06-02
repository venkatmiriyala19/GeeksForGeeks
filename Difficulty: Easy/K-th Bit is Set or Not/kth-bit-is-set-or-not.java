class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // Your code here
        return (n&(1<<k)) !=0;
    }
}