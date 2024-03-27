class Solution:
    def commonElements (self,A, B, C, n1, n2, n3):
        s1=set(A)
        s2=set(B)
        s3=set(C)
        s=set()
        for i in A:
            if i in s2 and i in s3:
                s.add(i)
        for i in B:
            if i in s1 and i in s3:
                s.add(i)
        for i in C:
            if i in s1 and i in s2:
                s.add(i)
        l=list(s)
        l.sort()
        return l
