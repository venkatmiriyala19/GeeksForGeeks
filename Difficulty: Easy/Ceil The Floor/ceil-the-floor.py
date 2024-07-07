#User function Template for python3




def getFloorAndCeil(arr, n, x):
    diff=0
    summer=max(arr)
    for i in range(n):
        if (x-arr[i]>=0):
            diff=max(arr[i],diff)
        if (arr[i]-x>=0):
            summer=min(summer,arr[i])
    if (max(arr)<x):
        summer=-1
    if (min(arr)>x):
        diff=-1
    return [diff,summer]
    
    # code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3



if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n, x = list(map(int, input().strip().split()))
        arr = list(map(int, input().strip().split()))

        ans = getFloorAndCeil(arr, n, x)
        print(str(ans[0]) + " " + str(ans[1]))
        tc -= 1

# } Driver Code Ends