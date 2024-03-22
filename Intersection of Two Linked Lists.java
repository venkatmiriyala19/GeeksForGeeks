class Solution
{
    public static Node findIntersection(Node head1, Node head2)
    {
        HashSet<Integer> set=new HashSet<>();
        Node current=head2;
        while(current!=null){
            set.add(current.data);
            current=current.next;
        }
        current=head1;
        Node dummy=new Node(-1);
        Node prev=dummy;
        // Node prev=null;
        // dummy.next=prev;
        while(current!=null){
            if(set.contains(current.data)){
                Node temp=new Node(current.data);
                prev.next=temp;
                prev=prev.next;
                
            }
            current=current.next;
        }
        return dummy.next;
        // add your code here
        // return the head of intersection list
    }
}
