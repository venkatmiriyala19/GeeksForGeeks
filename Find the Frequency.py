def findFrequency (arr, n, x):
    j=0
    for i in arr:
        if i==x:
            j+=1
    return j
