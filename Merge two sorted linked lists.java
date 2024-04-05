class LinkedList
{
    //Function to merge two sorted linked list.
    Node sortedMerge(Node head1, Node head2) {
        ArrayList<Integer> list=new ArrayList<>();
        Node current=head1;
        while(current.next!=null){
           current=current.next;
        }
        current.next=head2;
        current=head1;
        while(current!=null){
             list.add(current.data);
            current=current.next;
        }
        Collections.sort(list);
        current=head1;
        for (Integer element:list){
            current.data=element;
            current=current.next;
        }
        return head1;
     // This is a "method-only" submission. 
     // You only need to complete this method
   } 
}
