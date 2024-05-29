class Solution:
    def findUnique(self, a, n, k): 
        freq={}
        for i in a:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        for i in freq:
            if freq[i]%k!=0:
                return i
        #Code here


#{ 
 # Driver Code Starts
import sys 

if __name__=='__main__':
    T = int(input())

    for _ in range(T):
        n,k=[int(x) for x in input().split()]
        a = [int(x) for x in input().split()]

        print(Solution().findUnique(a,n,k))
# } Driver Code Ends