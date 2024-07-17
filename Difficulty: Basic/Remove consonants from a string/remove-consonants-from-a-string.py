#User function Template for python3

class Solution:
    def removeConsonants(self, s):
        s1=""
        for i in s:
            if i in 'aeiouAEIOU':
                s1+=i
        if s1:
            return s1
        return "No Vowel"
        #complete the function here



#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        s = input()
        ob = Solution()
        print(ob.removeConsonants(s))
# } Driver Code Ends