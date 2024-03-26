def leaders(self, A, N):
        c=0
        d=[]
        for i in range(1,N+1):
            if A[-i]>=c:
                d.append(A[-i])
                c=A[-i]
        d.reverse()
        return d
