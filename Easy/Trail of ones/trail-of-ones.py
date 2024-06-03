#User function Template for python3
class Solution:
    def numberOfConsecutiveOnes (ob,n):
        f0=0
        f1=1
        f2=1
        
        mod=1e9+7
        for i in range(3,n+1):
            add=(f0+f1)%mod
            f2=(2*f2+add)%mod
            f0=f1
            f1=add
        return int(f2)
            
            
        # code here 
        


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):

        N = int(input())

        ob = Solution()
        print(ob.numberOfConsecutiveOnes(N))

# } Driver Code Ends