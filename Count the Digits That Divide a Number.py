class Solution(object):
    def countDigits(self, num):
        a=num
        c=0
        while(num!=0):
            rem=num%10
            if (a%rem==0):
                c+=1
            num=num//10
        return c
