class Solution:
    def duplicates(self, arr, n): 
        S=set()
        arr.sort();
        for i in range(n-1):
            if arr[i]==arr[i+1]:
                S.add(arr[i])
        a=list(S)
        a.sort()
        if len(a)>=1:
            return a
        else:
            return [-1]
        # code here
            








#{ 
 # Driver Code Starts
if(__name__=='__main__'):
    t = int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        res = Solution().duplicates(arr, n)
        for i in res:
            print(i,end=" ")
        print()



# } Driver Code Ends