#User function template for Python

class Solution:
    def rectanglesInCircle(self,r):
        cnt=0
        l=2*r
        for i in range(1,l):
            for j in range(1,l):
                if (i*i+j*j<=4*r*r):
                    cnt+=1
        return cnt
        #code here


#{ 
 # Driver Code Starts
#Initial Template for Python

import math

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        N = int(input())
        ob = Solution()
        ans = ob.rectanglesInCircle(N)
        print(ans)

# } Driver Code Ends