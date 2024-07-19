#User function Template for python3
class Solution:
    def minAnd2ndMin(self, arr):
        s=set(arr)
        arr=list(s)
        arr.sort()
        if len(arr)>1:
            return [arr[0],arr[1]]
        return [-1]
        #code here
        
    




#{ 
 # Driver Code Starts
#Initial Template for Python 3


def main():

    T = int(input())

    while (T > 0):
        arr = [int(x) for x in input().strip().split()]
        obj = Solution()
        product = obj.minAnd2ndMin(arr)
        if product[0] == -1:
            print(product[0])
        else:
            print(product[0], end=" ")
            print(product[1])

        T -= 1


if __name__ == "__main__":
    main()

# } Driver Code Ends