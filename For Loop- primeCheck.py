from math import sqrt
class Solution:
    def isPrime(self, n : int) -> str:
        # code here
        if (n==0 or n==1):
            return "No"
        
        for i in range(2,int(sqrt(n))+1):
            if(n%i==0):
                return "No"
        return "Yes"
