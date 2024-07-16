#User function Template for python3
class Solution:
	def printString(self, s, ch, count):
	   # s1=""
	    c=0
	    i=0
	    while(c<count and i<len(s)):
	        if s[i]==ch:
	            c+=1
	        i+=1
	    if s[i:]:
	        return s[i:]
	    return ""
		# code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        s = input()
        ch = input()[0]
        count = int(input())
        ob = Solution()
        answer = ob.printString(s, ch, count)

        print(answer)

# } Driver Code Ends