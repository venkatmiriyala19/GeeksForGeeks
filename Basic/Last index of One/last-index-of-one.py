#User function Template for python3

class Solution:
    def lastIndex(self, s):
        n=len(s)
        for i in range(1,len(s)+1):
            if s[-i]=='1':
                return n-i
        return -1
        # code here
        
        



#{ 
 # Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while(T > 0):
    	s = input()
    	ob = Solution()
    	print(ob.lastIndex(s))
    	
    	T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends