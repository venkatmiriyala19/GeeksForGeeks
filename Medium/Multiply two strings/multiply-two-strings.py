#User function Template for python3

class Solution:
    def multiplyStrings(self,s1,s2):
        a=int(s1)
        b=int(s2)
        return str(a*b)
        # code here
        # return the product string


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == "__main__":
    t=int(input())
    for i in range(t):
        a,b=input().split()
        print(Solution().multiplyStrings( a.strip() , b.strip() ))

# } Driver Code Ends