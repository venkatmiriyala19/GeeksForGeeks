class Solution:
    def increment(self, arr, N):
        a=''.join(map(str,arr))

        a=int(a)+1
        a=str(a)
        
        b=[int(x) for x in a]
        return b
