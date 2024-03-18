class Solution {
    public Node sortedInsert(Node head, int data) {
        if (head==null){
            Node temp=new Node(data);
            head=temp;
            head.next=head;
            return head;
        }
        Node current=head.next;
        Node prev=head;
        if (head.data>=data){
            Node temp=new Node(data);
            temp.next=head.next;
            head.next=temp;
            temp.data=head.data;
            head.data=data;
            return head;
        }
        while(current!=head){
            if (current.data>=data){
                Node temp=new Node(data);
                prev.next=temp;
                temp.next=current;
                return head;
            }
            prev=current;
            current=current.next;
        }
        Node temp=new Node(data);
        prev.next=temp;
        temp.next=head;
        return head;
        // code here
    }
}
