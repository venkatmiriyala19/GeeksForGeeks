class Solution:

	def count(self,arr, n, x):
	    a=0
	    for i in arr:
	        if i==x:
	            a+=1
	    return a
