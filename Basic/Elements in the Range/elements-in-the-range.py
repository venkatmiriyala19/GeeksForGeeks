class Solution:
    def check_elements(self, arr, n, A, B):
        b=set(arr)
        for i in range(A,B+1):
            if i not in b:
                return False
        return True
        # Your code goes here
        


#{ 
 # Driver Code Starts
if __name__ == '__main__': 
    
    t=int(input())
    for _ in range(0,t):
        l = list(map(int, input().split()))
        n=l[0]
        k=l[1]
        y=l[2]
        a = list(map(int,input().split()))
        ob = Solution()
        ans=ob.check_elements(a,n,k,y)
        if(ans):
            print("Yes")
        else:
            print("No")
# } Driver Code Ends