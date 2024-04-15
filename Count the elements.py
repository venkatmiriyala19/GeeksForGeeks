from bisect import bisect
class Solution:
    
    def countElements(self, a, b, n, query, q):
        b.sort()
        return [bisect(b, a[i]) for i in query]
