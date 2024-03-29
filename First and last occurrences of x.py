class Solution:
    def find(self, arr, n, x):
        if x not in arr:
            return [-1,-1]
        freq={}
        for i in arr:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        a=arr.index(x)
        d=freq[x]-1+a
        b=[a,d]
        return b
