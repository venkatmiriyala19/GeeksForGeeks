#User function Template for python3

class Solution:
    #Function to count subarrays with sum equal to 0.
    def findSubArrays(self,arr,n):
        freq={0:1}
        sum=0
        ans=0
        for i in range(n):
            sum+=arr[i]
            if(sum-0 in freq):
                ans+=freq[sum]
                freq[sum]+=1
            else:
                freq[sum]=1
        return ans
                
            
                
                
        
        #return: count of sub-arrays having their sum equal to 0


#{ 
 # Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
        
if __name__=='__main__':
    t=int(input())
    for tc in range(t):
        
        N=int(input())
        A = [int(x) for x in input().strip().split(' ')]
        ob = Solution()
        print(ob.findSubArrays(A,N))
        
                
                
# } Driver Code Ends