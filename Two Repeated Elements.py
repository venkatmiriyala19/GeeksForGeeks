class Solution:
    
    #Function to find two repeated elements.
    def twoRepeated(self, arr , n):
        freq={}
        a=[]
        for i in arr:
            if i in freq:
                a.append(i)
            else:
                freq[i]=1
        return a
        #Your code here
