class Solution:

    def countWords(self, s):
        s=s.replace("\\n",' ')
        s=s.replace('\\t',' ')
        return len(s.split())
