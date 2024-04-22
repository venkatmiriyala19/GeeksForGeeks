class Solution:
    def minRow(self,n,m,a):
        one=[]
        c=0
        for i in range(n):
            for j in range(m):
                if a[i][j]==1:
                    c+=1
            one.append(c)
            c=0
        b=min(one)
        
        return one.index(b)+1
