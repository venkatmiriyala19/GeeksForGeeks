class Solution:
    def findSingle(self, n, arr):
        freq={}
        for i in arr:
            if i in freq:
                freq[i]+=1
                continue
            freq[i]=1
        for i in freq:
            if freq[i]%2!=0:
                return i
