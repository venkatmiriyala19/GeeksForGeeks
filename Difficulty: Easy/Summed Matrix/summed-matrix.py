#User function Template for python3

class Solution:
    def sumMatrix(self, n, q):
        ans=abs(n-abs(n+1-q))
        if(q<=1 or q>2*n):
            return 0
        return ans
        # code here 


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n, q = map(int, input().split())

        ob = Solution()
        print(ob.sumMatrix(n, q))

# } Driver Code Ends