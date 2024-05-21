#User function Template for python3

class stack:
    def __init__(self):
        self.s=[]
        self.minEle=[]
        self.top=None

    def push(self,x):
        if self.s==[]:
            self.s.append(x)
            self.minEle.append(x)
        else:
            self.s.append(x)
            self.minEle.append(min(x,self.minEle[-1]))
        #CODE HERE

    def pop(self):
        if self.s==[]:
            return -1
        self.minEle.pop()
        return self.s.pop()
        #CODE HERE
        

    def getMin(self):
        if self.minEle==[]:
            return -1
        return self.minEle[-1]
        #CODE HERE


#{ 
 # Driver Code Starts
#contributed by RavinderSinghPB
if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        q = int(input())

        arr = [int(x) for x in input().split()]

        stk=stack()  

        qi = 0
        qn=1
        while qn <= q:
            qt = arr[qi]

            if qt == 1:
                stk.push(arr[qi+1])
                qi+=2
            elif qt==2:
                print(stk.pop(),end=' ')
                qi+=1
            else:
                print(stk.getMin(),end=' ')
                qi+=1
            qn+=1
        print()

# } Driver Code Ends