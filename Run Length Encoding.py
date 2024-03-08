from collections import Counter
class Solution:
    def encode(self, s : str) -> str:
        s+=' '
        s=s.lower()
        s1=''
        count=1
        for i in range(1,len(s)):
            if s[i]!=s[i-1]:
                s1+=s[i-1]+str(count)
                count=1
            else:
                count+=1
        return s1
