class Solution {
    Node deleteMid(Node head) {
        Node current=head;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        if (count%2==0){
        count=count/2;}
        else{
            count=(count/2);
        }
        Node prev=null;
        current=head;
        while(count>0){
            count--;
            prev=current;
            current=current.next;
        }
        prev.next=current.next;
        return head;
        // This is method only submission.
        // You only need to complete the method.
    }
}
