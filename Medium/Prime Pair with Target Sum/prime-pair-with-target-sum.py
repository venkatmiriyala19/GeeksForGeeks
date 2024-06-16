
from typing import List


class Solution:
    def getPrimes(self, n : int) -> List[int]:
        primes=[True]*(n+1)
        primes[0]=primes[1]=False
        result=[]
        for i in range(2,int(n**0.5)+1):
            if primes[i]:
                for j in range(i*i,n+1,i):
                    primes[j]=False
        found=False
        for i in range(2,n+1):
            if primes[i] and primes[n-i]:
                result.append(i)
                result.append(n-i)
                found=True
                break
        if not found:
            result.extend([-1,-1])
        return result
        # code here
        



#{ 
 # Driver Code Starts
class IntArray:

    def __init__(self) -> None:
        pass

    def Input(self, n):
        arr = [int(i) for i in input().strip().split()]  #array input
        return arr

    def Print(self, arr):
        for i in arr:
            print(i, end=" ")
        print()


if __name__ == "__main__":
    t = int(input())
    for _ in range(t):

        n = int(input())

        obj = Solution()
        res = obj.getPrimes(n)

        IntArray().Print(res)

# } Driver Code Ends