/*
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {
    // Function to find the length of a loop in the linked list.
    public int countNodesinLoop(Node head) {
        // code here.
        Node slow=head,fast=head;
        int cnt=0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cnt++;
                slow=slow.next;
                while(slow!=fast){
                    slow=slow.next;
                    cnt++;
                }
                return cnt;
            }
        }
        return cnt;
    }
}