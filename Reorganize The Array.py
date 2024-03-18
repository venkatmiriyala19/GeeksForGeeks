def Rearrange (arr,  n) : 
    s=set(arr)
    b=[]
    for i in range(n):
        if i not in s:
            b.append(-1)
            continue
        b.append(i)
    return b
