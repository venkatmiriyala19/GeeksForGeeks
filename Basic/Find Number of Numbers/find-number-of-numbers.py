# Your task is to complete this function
# Function should return an integer
def num(arr, n, k):
    count=0
    g=str(k)
    for i in arr:
        a=str(i)
        count=count+a.count(g)
    return count
    # Code here



#{ 
 # Driver Code Starts
if __name__=='__main__':
    t = int(input())
    for i in range(t):
        n = int(input())
        arr = list(map(int, input().strip().split()))
        k = int(input())
        print(num(arr, n, k))
# Contributed By: Harshit Sidhwa

# } Driver Code Ends