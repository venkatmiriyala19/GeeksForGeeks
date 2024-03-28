class Solution:
    def findTwoElement( self,arr, n):
        s=set(arr)
        l=[]
        for i in range(1,n+1):
            l.append(i)
        freq={}
        a=[]
        for i in arr:
            if i in freq:
                a.append(i)
            else:
                freq[i]=1
        for i in l:
            if i not in s:
                a.append(i)
        return a
