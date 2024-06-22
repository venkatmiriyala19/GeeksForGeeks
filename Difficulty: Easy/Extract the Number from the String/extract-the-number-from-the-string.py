class Solution:
    def ExtractNumber(self,sentence):
        s=""
        maxi=-1
        for i in sentence:
            if i in '123456780':
                s+=i
            else:
                if s!='':
                    maxi=max(maxi,int(s))
                s=""
        return maxi
        #code here


#{ 
 # Driver Code Starts
t = int(input())
for _ in range(t):
    S = input()
    ob = Solution()
    ans = ob.ExtractNumber(S)
    print(ans)

# } Driver Code Ends