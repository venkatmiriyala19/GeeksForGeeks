class Solution:
    def findMin(self, n):
       # code here 
        res=0
        arr=[1,2,5,10]
        i=-1
        while(n>0):
            if(n>=arr[i]):
               n-=arr[i]
               res+=1
            else:
                i-=1
        return res
       