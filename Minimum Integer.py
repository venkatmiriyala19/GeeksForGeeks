from typing import List


class Solution:
    def minimumInteger(self, N : int, A : List[int]) -> int:
        tsum=sum(A)
        a=[]
        for i in range(N):
            if N*A[i]>=tsum:
                a.append(A[i])
        return min(a)
