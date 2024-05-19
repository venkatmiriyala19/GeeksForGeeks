# Function should return an integer value
def convertFive(n):
    a=str(n)
    a=a.replace('0','5')
    return int(a)
    # Code here


#{ 
 # Driver Code Starts
# Your code goes here
if __name__=='__main__':
    t = int(input())
    for i in range(t):
        print (convertFive(int(input().strip())))
# } Driver Code Ends