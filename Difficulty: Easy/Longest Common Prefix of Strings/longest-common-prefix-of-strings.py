#User function Template for python3

class Solution:
    def longestCommonPrefix(self, arr):
        if not arr:
            return "-1"
        prefix = arr[0]
        for string in arr[1:]:
            i = 0
            while i < len(prefix) and i < len(string) and prefix[i] == string[i]:
                i += 1
            prefix = prefix[:i]
            if not prefix:
                return "-1"
        return prefix
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        arr = [x for x in input().strip().split(" ")]

        ob = Solution()
        print(ob.longestCommonPrefix(arr))

# } Driver Code Ends