class Solution:
    def findMissing(self,a,b,n,m):
        arr=set(b)
        new=[]
        for i in a:
            if i not in arr:
                new.append(i)
        return new
