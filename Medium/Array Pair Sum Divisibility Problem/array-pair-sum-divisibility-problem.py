#User function Template for python3
from collections import defaultdict
class Solution:
	def canPair(self, nuns, k):
	    if(len(nuns)%2==1):
	        return False
	    freq=defaultdict(int)
	    ans=0
	    for i in range(len(nuns)):
	        rem=nuns[i]%k
	        
	        
	        freq[rem]+=1
	    for i in range(k):
	        if(i==0 and freq[0]%2==1):
	            return False
	        if(i!=0 and i+i==k and freq[i]%2==1):
	            return False
	        if(i!=0 and freq[i]!=freq[k-i]):
	            return False
	    return True
	    
	    
	        
		# Code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
	T=int(input())
	for i in range(T):
		n, k = input().split()
		n = int(n)
		k = int(k)
		nums = list(map(int, input().split()))
		ob = Solution()
		ans = ob.canPair(nums, k)
		if(ans):
			print("True")
		else:
			print("False")
# } Driver Code Ends