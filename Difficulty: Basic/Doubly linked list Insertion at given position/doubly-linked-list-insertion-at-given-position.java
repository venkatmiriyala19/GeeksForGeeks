/* Structure of Doubly Linked List
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}*/

class Solution {
    // Function to insert a new node at given position in doubly linked list.
    Node addNode(Node head, int p, int x) {
        // Your code here
        Node temp=head;
        while(p!=0){
            p--;
            temp=temp.next;
        }
        Node dummy=new Node(x);
        dummy.next=temp.next;
        temp.next=dummy;
        dummy.prev=temp;
        return head;
    }
}