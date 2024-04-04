class Solution:

	def rowWithMax1s(self,arr, n, m):
	    a=[]
	    for i in arr:
	        c=0
	        for j in i:
	            if j==1:
	                c+=1
	        a.append(c)
	   # print(a)
	    
	    b=max(a)
	    if b==0:
	        return -1
	    return a.index(b)
