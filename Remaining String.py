class Solution:
	def printString(self, S, ch, count):
	    c=1
	    if count==0:
	        return S
	    for i in range(len(S)):
	        if S[i] == ch:
	            if c==count and S[i+1:]!='':
	                return S[i+1:]
	            c+=1
	    return 'Empty string'
