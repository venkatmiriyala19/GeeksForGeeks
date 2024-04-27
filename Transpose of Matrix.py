class Solution:
    def transpose(self, matrix, n):
        for i in range(n):
            for j in range(i):
                matrix[i][j],matrix[j][i]=matrix[j][i],matrix[i][j]
        # Write Your code here
