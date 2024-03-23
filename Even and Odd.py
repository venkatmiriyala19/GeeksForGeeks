class Solution:
    def reArrange(self, arr, N):
        even=[]
        odd=[]
        a=[]
        for i in arr:
            if i%2==0:
                even.append(i)
                continue
            odd.append(i)
        for i in range(len(arr)//2):
            a.append(even[i])
            a.append(odd[i])
        arr[:]=a
