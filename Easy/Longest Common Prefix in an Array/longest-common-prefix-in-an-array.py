#User function Template for python3

class Solution:
    def longestCommonPrefix(self, arr, n):
        word=min(arr,key=len)
        s=''
        for i in range(len(word)):
            flag=1
            for j in arr:
                if j[i]==word[i]:
                    continue
                else:
                    flag=0
                    break
            if flag==0:
                break
            else:
                s+=word[i]
        if s=='':
            return -1
        return s
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__=='__main__':
    t=int(input())
    for _ in range(t):
        n = int(input())
        arr = [x for x in input().strip().split(" ")]
        
        ob=Solution()
        print(ob.longestCommonPrefix(arr, n))
# } Driver Code Ends