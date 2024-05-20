class Solution:
	def topK(self, nums, k):
	    freq={}
	    for i in nums:
	        if i in freq:
	            freq[i]+=1
	        else:
	            freq[i]=1
	    count_list = list(freq.items())
        count_list.sort(key=lambda x: (x[1], x[0]),reverse=True)
        return [item[0] for item in count_list[:k]]
	        
	        
		#Code here


#{ 
 # Driver Code Starts
		
if __name__ == '__main__':
    T=int(input())
    for i in range(T):
    	a = list(map(int, input().strip().split()))
    	n = a[0]
    	nums = a[1:]
    	k = int(input().strip())
    	obj = Solution()
    	ans = obj.topK(nums, k)
    	for i in ans:
    		print(i, end = " ")
    	print()
    	
# } Driver Code Ends