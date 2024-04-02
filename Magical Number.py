from typing import List


class Solution:
    def findMagicalNumber(self, N : int, arr : List[int]) -> int:
        # d=[]
        for i in range(N):
            if i==arr[i]:
                return i
        return -1
