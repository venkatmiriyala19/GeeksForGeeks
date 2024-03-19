class Solution:
    def printMinIndexChar(self, S, patt):
        for i in S:
            if i in patt:
                return i
		#Code here
		return '$'
