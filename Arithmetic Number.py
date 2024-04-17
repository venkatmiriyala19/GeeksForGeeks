class Solution:
    def inSequence(self, A, B, C):
        if C==0:
            if A==B:
                return 1
            return 0
        if (B-A)%C==0 and (B-A)//C>=0:
            return 1
        return 0
            
