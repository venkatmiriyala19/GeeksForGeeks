
from typing import List


class Solution:
    def missingNumber(self, n : int, arr : List[int]) -> int:
        a=sum(arr)
        b=(n*(n+1))//2
        return b-a
        # code here
        



#{ 
 # Driver Code Starts

class IntArray:
    def __init__(self) -> None:
        pass
    def Input(self,n):
        arr=[int(i) for i in input().strip().split()]#array input
        return arr
    def Print(self,arr):
        for i in arr:
            print(i,end=" ")
        print()


if __name__=="__main__":
    t = int(input())
    for _ in range(t):
        
        n = int(input())
        
        
        arr=IntArray().Input(n-1)
        
        obj = Solution()
        res = obj.missingNumber(n, arr)
        
        print(res)
        

# } Driver Code Ends