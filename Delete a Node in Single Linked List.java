class GfG
{
    Node deleteNode(Node head, int x)
    {
        Node current=head;
        Node prev=null;
        int c=1;
        if (x==1){
            head=head.next;
            return head;
        }
        while(c<x){
            prev=current;
            current=current.next;
            c++;
        }
         prev.next=current.next;
         current.next=null;
        return head;
	// Your code here	
    }
}
