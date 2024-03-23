class Solution {
    public static Node moveToFront(Node head) {
        if (head.next==null || head==null){
            return head;
        }
        Node current=head;
        while(current.next.next!=null){
            current=current.next;
        }
        Node prev=current.next;
        prev.next=head;
        current.next=null;
        head=prev;
        return head;
        // code here
    }
}
        
