#User function Template for python3

class Solution:
    ##Complete this function
    # Function to check if given number n is a power of two.
    def isPowerofTwo(self,n : int ) -> bool:
        def power2(i):
            a=2*i
            if (a==n):
                return True
            if(a>n):
                return False
            return power2(a)
        if (n==1 or n==2):
            return True
        
        return power2(1)
            
        ##Your code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

import math


def main():

    T = int(input())

    while (T > 0):

        n = int(input())
        ob = Solution()
        if ob.isPowerofTwo(n):
            print("true")
        else:
            print("false")

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends