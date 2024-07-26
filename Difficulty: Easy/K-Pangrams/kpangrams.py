#User function Template for python3
class Solution:
    def kPangram(self,string, k):
        if len(string)<26:
            return False
        string=string.replace(" ","")
        if len(string)>=26:
            
            s=set()
            for i in string:
                s.add(i)
            if k+len(s)>=26:
                return True
        return False
            
    # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())

    for tcs in range(T):
        string = input()
        K = int(input())
        ob = Solution()
        a = ob.kPangram(string, K)
        if a:
            print("true")
        else:
            print("false")

# } Driver Code Ends