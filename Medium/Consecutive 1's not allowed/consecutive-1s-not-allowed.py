#User function Template for python3
class Solution:

	def countStrings(self,n):
	    ans=2
	    ans2=3
	    if(n==1):
	        return 2
	    if n==2:
	        return 3
	    for i in range(2,n):
	        ans3=(ans+ans2)%1000000007
	        ans=ans2
	        ans2=ans3
	    return ans3
	        
	        
    	# code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3



# Driver code 
if __name__ == "__main__": 		
    tc=int(input())
    while tc > 0:
        n=int(input())
        ob = Solution()
        ans = ob.countStrings( n)
        print(ans)
        tc=tc-1
# } Driver Code Ends