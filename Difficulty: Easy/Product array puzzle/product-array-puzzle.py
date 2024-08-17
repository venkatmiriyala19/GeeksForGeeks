#User function Template for python3

class Solution:
    def productExceptSelf(self, nums):
        prod=1
        count=0
        for i in nums:
            if i!=0:
                prod*=i
            else:
                count+=1
        res=[]
        # print(prod)
        for i in range(len(nums)):
            if count>1:
                res.append(0)
            elif count==1:
                if nums[i]==0:
                    res.append(prod)
                else:
                    res.append(0)
            else:
                res.append(prod//nums[i])
        return res
        #code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())

    for _ in range(t):
        n = int(input())
        arr = [int(x) for x in input().split()]

        ans = Solution().productExceptSelf(arr)
        print(*ans)

# } Driver Code Ends