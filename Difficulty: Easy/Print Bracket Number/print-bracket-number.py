#User function Template for python3
class Solution:
	def bracketNumbers(self, str):
	    open_ket=1
	    st=[]
	    a=[]
	    for i in str:
	        if i =="(":
	            
	            a.append(open_ket)
	            st.append(open_ket)
	            open_ket+=1
	        elif i==")":
	            k=st.pop()
	            a.append(k)
	    return a
		# code here


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    T = int(input())
    for i in range(T):
        S = input()
        ob = Solution()
        answer = ob.bracketNumbers(S)
        for value in answer:
            print(value, end=" ")
        print()

# } Driver Code Ends