class Solution:
    #Complete this function
    def power(self,N,R):
        mod=1000000007
        
        # return (N**R)%mod
        return pow(N,R,mod)
