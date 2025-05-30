/*

Definition for doubly Link List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node deleteNode(Node head, int x) {
        // code here
        Node temp=head;
        if(x==1){
            head=head.next;
            head.prev=null;
            return head;
        }
        while(x!=2){
            x--;
            temp=temp.next;
        }
        if(temp.next.next!=null){
            temp.next=temp.next.next;
            temp=temp.next;
            temp.prev=temp.prev.prev;
            return head;
        }
        temp.next=null;
        return head;
        
        
    }
}