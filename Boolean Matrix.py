def booleanMatrix(matrix):
    # code here 
    row=set()
    column=set()
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if matrix[i][j]==1:
                row.add(i)
                column.add(j)
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            if i in row or j in column:
                matrix[i][j]=1
    return matrix
