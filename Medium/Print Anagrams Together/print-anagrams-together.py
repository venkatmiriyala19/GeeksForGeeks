#User function Template for python3

class Solution:
    def Anagrams(self, words, n):
        list1=[]
        for i in range(n):
            list1.append("".join(sorted(words[i])))
        set1=set(list1)
        append1=[]
        res=[]
        for i in set1:
            for j in range(n):
                if i==list1[j]:
                    append1.append(words[j])
            res.append(append1)
            append1=[]
        return res
        '''
        words: list of word
        n:      no of words
        return : list of group of anagram {list will be sorted in driver code (not word in grp)}
        '''
        
        #code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

#contributed by RavinderSinghPB
if __name__ =='__main__':
    t= int(input())
    for tcs in range(t):
        n= int(input())
        words=input().split()
        
        ob = Solution()
        ans = ob.Anagrams(words,n)
        
        for grp in sorted(ans):
            for word in grp:
                print(word,end=' ')
            print()

# } Driver Code Ends