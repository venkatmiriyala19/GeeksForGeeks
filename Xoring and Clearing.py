class Solution:
    def printArr(self, n, arr):
        for i in arr:
            print(i,end=' ')
        print()
        # printing array elements with spaces
        

    def setToZero(self, n, arr):
        for i in range(n):
            arr[i]=0
        return arr
        # setting all elements to zero
        

    def xor1ToN(self, n, arr):
        for i in range(n):
            arr[i]=arr[i] ^ i
        return arr
