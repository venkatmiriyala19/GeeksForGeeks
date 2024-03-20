public static Node reverseDLL(Node  head)
{
    Node prev=null;
    Node current=head;
    Node next=current.next;
    while(current!=null){
        current.prev=next;
        current.next=prev;
        prev=current;
        current=next;
        if(current!=null){
            next=current.next;
        }
            }
        head=prev;
        return head;
}
