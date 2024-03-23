class Solution:
    
    def getSingle(self,arr, n):
        freq={}
        for i in arr:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        for i in freq:
            if freq[i]%2!=0:
                return i
        return 0
