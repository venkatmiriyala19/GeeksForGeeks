class Solution {
    Node sortedInsert(Node head1, int key) {
        Node current=head1;
        Node prev=null;
        Node temp=new Node(key);
        if (head1.data>key){
            temp.next=head1;
            head1=temp;
            return head1;
        }
        while(current!=null){
            if (current.data>key){
                prev.next=temp;
                temp.next=current;
                break;
            }
            prev=current;
            current=current.next;
        }
        if (prev.next==null){
            prev.next=temp;
        }
        return head1;
        // Add your code here.
    }
}
