#User function Template for python3

class Solution:
    def firstRep(self, s):
        freq={}
        a=[]
        for i in s:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
                a.append(i)
        for i in a:
            if freq[i]>1:
                return i
        return -1
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input().strip()
        ob = Solution()
        ans = ob.firstRep(s)
        if ans is '#':
            print(-1)
        else:
            print(ans)
        
# } Driver Code Ends