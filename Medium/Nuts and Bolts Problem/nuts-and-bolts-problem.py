#User function Template for python3
class Solution:

	def matchPairs(self, n, nuts, bolts):
	    order = [ '!','#','$','%','&','*','?','@','^']
	    u=set(nuts)
	    y=set(bolts)
        n=[]
        for i in order:
            if i in u and i in y:
                n.append(i)
        nuts[:] = n
        bolts[:] = n
		# code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        nuts = list(map(str, input().strip().split()))
        bolts = list(map(str, input().strip().split()))
        ob = Solution()
        ob.matchPairs(n, nuts, bolts)
        for x in nuts:
            print(x, end=" ")
        print()
        for x in bolts:
            print(x, end=" ")
        print()
        tc -= 1

# } Driver Code Ends