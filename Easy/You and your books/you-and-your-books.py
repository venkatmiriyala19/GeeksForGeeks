
class Solution:
    #Your task is to complete this function
    #Function should return an integer
    #a - list/array containing height of stack's respectively
    def max_Books(self, n, k, arr):
        maxi=0
        barr=[]
        for i in range(n):
            if arr[i]<=k:
                maxi+=arr[i]
            if arr[i]>k:
                barr.append(maxi)
                maxi=0
        barr.append(maxi)
        return max(barr)
            
        #code here


#{ 
 # Driver Code Starts
if __name__ == '__main__':
    t = int(input())
    for i in range(t):
        temp = list(map(int, input().strip().split()))
        n = temp[0]
        k = temp[1]
        arr = list(map(int, input().strip().split()))
        ob = Solution()
        print(ob.max_Books(n, k, arr))
# Contributed by:Harshit Sidhwa

# } Driver Code Ends