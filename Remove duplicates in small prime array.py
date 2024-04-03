class Solution:
    def removeDuplicates(self, arr):
        seen=set()
        a=[]
        for ch in arr:
            if ch not in seen:
                seen.add(ch)
                a.append(ch)
        return a
