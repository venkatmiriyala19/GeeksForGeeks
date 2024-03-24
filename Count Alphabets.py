class Solution:

    def Count(self, S):
        c=0
        S=S.lower()
        for i in S:
            if i in 'abcdefghijklmnopqrstuvwxyz':
                c+=1
        return c
