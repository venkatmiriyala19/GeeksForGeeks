#User function Template for python3

class Solution:
    
    #Function to find the maximum number of meetings that can
    #be performed in a meeting room.
    def maximumMeetings(self,start,end):
        # code here
        n=len(start)
        meetings=[[start[i],end[i]] for i in range(n)]
        
        meetings.sort(key=lambda x:x[1])
        
        prevEnd=meetings[0][1]
        cnt=1
        
        for i in range(1,n):
            if(meetings[i][0]>prevEnd):
                prevEnd=meetings[i][1]
                cnt+=1
        return cnt 