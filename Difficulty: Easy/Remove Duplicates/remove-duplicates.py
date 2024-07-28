#User function Template for python3
class Solution:
    def removeDups(self, S):
        s1=''
        for i in S:
            if i in s1:
                continue
            s1+=i
        return s1
        # code here





#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        s = input()

        ob = Solution()
        answer = ob.removeDups(s)

        print(answer)

# } Driver Code Ends