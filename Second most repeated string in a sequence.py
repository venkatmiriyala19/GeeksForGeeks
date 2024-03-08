class Solution:
    def secFrequent(self, arr, n):
        freq={}
        for i in arr:
            if i in freq:
                freq[i]+=1
            else:
                freq[i]=1
        if len(freq)>=2:
            max_key=max(freq,key=freq.get)
            del freq[max_key]
            return max(freq,key=freq.get)
        return ''
