class Solution:
    def isPerfectNumber(self, N):
        # code here 
        if N<=1:
            return 0
        fact=0
        for i in range(1,int(N**0.5)+1):
            if N%i==0:
                fact+=i
                if N/i!=N:
                    fact+=N/i
        if fact==N:
            return 1
        return 0
