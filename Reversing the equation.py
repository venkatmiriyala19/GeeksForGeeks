class Solution:
    def reverseEqn(self, s):
        s1=''
        s2='0'
        s3=''
        a=[]
        for i in s:
            if i in '+-*/':
                s2+=i
                a.append(s1)
                s1=''
            else:
                s1+=i
        a.append(s1)
        for i in range(1,len(a)):
            s3+=a[-i]+s2[-i]
        s3+=a[0]
        return s3
            
        # code here
