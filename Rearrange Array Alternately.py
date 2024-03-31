class Solution:
    ##Complete this function
    #Function to rearrange  the array elements alternately.
    def rearrange(self,arr, n):
        length=len(arr)
        z=length
        if length<=1:
            return arr
        if length==2:
            arr.sort()
            arr.reverse()
            return arr
        arr1=[0]
        arr1[1:]=arr
        arr1.sort()
        arr2=[]
        length=length//2
        for i in range(1,length+1):
            arr2.append(arr1[-i])
            arr2.append(arr1[i])
        if (z%2!=0):
            arr2.append(arr1[i+1])
        arr[:]=arr2
        return arr
