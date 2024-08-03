class Solution:
    def celebrity(self, mat):
        potential=set()
        for i in range(len(mat)):
            check=False
            for j in range(len(mat[i])):
                if mat[i][j]==1:
                    check=True
                    potential.add(j)
            if check==False:
                potential.add(i)
        for i in potential:
            cnt=False
            for j in range(len(mat[i])):
                if mat[i][j]==1:
                    cnt=True
                    break
            if cnt==False:
                is_celebrity=True
                for k in range(len(mat)):
                    if k!=i and mat[k][i]==0:
                        is_celebrity=False
                if is_celebrity:
                    return i
        return -1
                
        # code here


#{ 
 # Driver Code Starts
# Main function to handle input and output
if __name__ == "__main__":
    t = int(input())
    for _ in range(t):
        n = int(input())
        M = []
        for _ in range(n):
            M.append(list(map(int, input().split())))

        ob = Solution()
        print(ob.celebrity(M))

# } Driver Code Ends