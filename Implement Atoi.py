class Solution:
    # your task is to complete this function
    # function should return an integer
    def atoi(self,s):
        if s[0] not in '1234567890-':
            return -1
        
            
        for i in s[1:]:
            if i not in '0123456789':
                return -1
        if s[0]=='-':
            a=int(s[1:])
            return (-a)
        else:
            return int(s)
