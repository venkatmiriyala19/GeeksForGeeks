#User function Template for python3
import builtins

class Solution:
    def compareFrac (self, str):
        
        s=''
        for i in str:
            # print(i)
            if i in '0987654321':
                s+=i
            elif i=='/':
                a=int(s)
                s=''
            elif i==',':
                b=int(s)
                s=''
                x=a/b
                z1=builtins.str(a)+'/'+builtins.str(b)
        b=int(s)
        y=a/b
        z2=builtins.str(a)+'/'+builtins.str(b)
        if (x<y):
            return z2
        elif(x==y):
            return 'equal'
        return z1
       
                    
                
        
        # code here
        



#{ 
 # Driver Code Starts
#Initial Template for Python 3
import re

if __name__ == '__main__':
    ob = Solution()
    t = int(input())
    for _ in range(t):
        str = input()
        print(ob.compareFrac(str))

# } Driver Code Ends