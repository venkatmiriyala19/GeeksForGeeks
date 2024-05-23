#User function Template for python3
class Solution:
	def firstAlphabet(self, S):
	    a=S.split(' ')
	    s=''
	    for i in a:
	        s+=i[0]
	    return s
		# code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		S = input()
		ob = Solution()
		answer = ob.firstAlphabet(S)
		
		print(answer)


# } Driver Code Ends