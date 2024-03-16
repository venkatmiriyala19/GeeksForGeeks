class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        
        Node end=head;
        Node current=head;
        Node prev=null;
        int c=1;
        while (end.next!=null){
            end=end.next;
            c++;
        }
        
        if (c==k){
            return head;
        }
        else if (k>c){
            return head;
        }
        for (int i=0;i<k;i++){
                prev=current;
                current=current.next;
            }
            end.next=head;
            prev.next=null;
            head=current;
            return head;
        // return head;
        // add code here
    }
}
