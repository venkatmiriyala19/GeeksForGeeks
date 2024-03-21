class Solution:
    def roundToNearest (self, N) : 
        N=int(N)
        if(N%10<=5):
            return N-N%10
        else:
            return N+(10-N%10)
