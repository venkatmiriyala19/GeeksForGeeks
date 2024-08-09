#User function Template for python3

class Solution:
    def Maximize(self, a):
        a.sort()
        s=0
        for i in range(len(a)):
            s=(s+(a[i]*i))%((10**9)+7)
        return s
        # Complete the function
      



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        A = list(map(int, input().strip().split()))
        # k = int(input())
        ob = Solution()
        print(ob.Maximize(A))

# } Driver Code Ends