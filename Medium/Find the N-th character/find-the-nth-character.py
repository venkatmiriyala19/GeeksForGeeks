#User function Template for python3

# class Solution:
#     def nthCharacter(self, s, r, n):
#         for i in range(r):
#             s1=''
#             for i in range(len(s)):
#                 if s[i]=='1':
#                     s1+='10'
#                 else:
#                     s1+='01'
#             s=s1
#         return s[n]
class Solution:
    def nthCharacter(self, s, r, n):
        if r<1:
            return s[n]
        def help(s):
            lis=[]
            for i in s:
                if i=='0':
                    lis.append('0')
                    lis.append('1')
                else:
                    lis.append('1')
                    lis.append('0')
            return ''.join(lis)
        count=0
        ind=-1
        while count<n+1:
            ind+=1
            count+=2**r
        S=s[ind]
        for i in range(r):
            S=help(S)
        count-=2**r
        return S[n-count]
        # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        snr = input().split()
        S, R, N = snr[0], int(snr[1]), int(snr[2])
        ob = Solution()
        print(ob.nthCharacter(S, R, N))
# } Driver Code Ends