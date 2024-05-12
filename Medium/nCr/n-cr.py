#User function Template for python3

class Solution:
    def nCr(self, n, r):
        def facto(n):
            fact=1
            for i in range(1,n+1):
                fact*=i
            return fact
        mod=1000000007
        if (n<r):
            return 0
        nfact=facto(n)
        rfact=facto(r)
        nrfact=facto(n-r)
        return (nfact//(rfact*nrfact))%mod
            
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import sys
sys.setrecursionlimit(10**6)

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, r = [int(x) for x in input().split()]
        
        ob = Solution()
        print(ob.nCr(n, r))
# } Driver Code Ends