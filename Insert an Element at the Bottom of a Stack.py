class Solution:
    def insertAtBottom(self,st,x):
        a=[]
        c=len(st)
        for i in range(len(st)):
            b=st.pop()
            a.append(b)
        # print(st)
        st.append(x)
        for i in range(len(a)):
            b=a.pop()
            st.append(b)
        return st
