#User function Template for python3
class Solution:
	def binaryNextNumber(self, s):
	    a=int(s,2)
	   # print(a)
	    a=a+1
	    b=bin(a)
	    return b[2:]
		# code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        S = input()
        ob = Solution()
        ans = ob.binaryNextNumber(S)
        print(ans)

# } Driver Code Ends