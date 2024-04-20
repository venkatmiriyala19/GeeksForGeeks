class Solution:
    def sortedMerge(self, a, b, c, n, m):
        # print(a+b)
        c[:]=a+b
        
        c.sort()
        return c
