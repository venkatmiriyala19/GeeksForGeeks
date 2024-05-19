#User function Template for python3

class Solution:
    def middle(self,A,B,C):
        if((A>B and A<C) or (A<B and A>C)):
            return A
        elif((B>A and B<C) or (B<A and B>C)):
            return B
        return C
        #code here



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        A,B,C=map(int,input().strip().split())
        ob=Solution()
        print(ob.middle(A,B,C))
# } Driver Code Ends