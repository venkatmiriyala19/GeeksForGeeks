class Solution:
    def reversedBits(self, x):
        a=bin(x & 0xFFFFFFFF)[2:]
        b = a.zfill(32)
        b=b[::-1]
        return int(b,2)
