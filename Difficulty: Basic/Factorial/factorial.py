#User function Template for python3


class Solution:
    def factorial (self, N):
        fact=1
        for i in range(1,N+1):
            fact*=i
        return fact
        
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int (input ())
    for _ in range (t):
        N = int(input())
        ob = Solution()
        print(ob.factorial(N))

# } Driver Code Ends