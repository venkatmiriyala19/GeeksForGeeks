#User function Template for python3
class Solution:
    def swapNibbles (self, n):
        a=bin(n)
        if(len(a)<10):
            a=format(n,'08b')
            b=a[-4:]
            c=a[:-4]
            a=b+c
            return int(a,2)
            
        b=a[-4:]
        # print(a)
        # print(b)
        c=a[2:-4]
        # print(c)
        # if len(c)<4:
        #     c='0'*(4-len(c))+c
        # print(c)
        a=b+c
        # print(a)
        return int(a,2)
        # code here 


#{ 
 # Driver Code Starts
#Initial Template for Python 3
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        n = int(input())

        ob = Solution()
        print(ob.swapNibbles(n))

# } Driver Code Ends