/*
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;

    DLLNode(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public DLLNode reverseDLL(DLLNode head) {
        // Your code here
        DLLNode previous=null;
        DLLNode curr=head;
        while(curr!=null){
            DLLNode temp=curr.next;
            curr.prev=temp;
            curr.next=previous;
            previous=curr;
            curr=temp;
        }
        return previous;
    }
}