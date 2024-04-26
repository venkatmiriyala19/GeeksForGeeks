
class Solution:
    def evenlyDivides (self, N):
        a=N
        c=0
        while(N>0):
            rem=N%10
            if rem!=0 and a%rem==0:
                c+=1
            N=N//10
        return c
        # code here
