class Solution:
	def singleNumber(self, nums):
	    freq={}
	    a=[]
	    for i in nums:
	        if i in freq:
	            freq[i]+=1
	        else:
	            freq[i]=1
	    for i in freq:
	        if freq[i]==1:
	            a.append(i)
	    a.sort()
	    return a
