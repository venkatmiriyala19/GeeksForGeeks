class Solution:
    #Function to return k largest elements from an array.
    def kLargest(self,li,n,k):
        li.sort()
        b=[]
        for i in range(1,k+1):
            b.append(li[-i])
        return b
