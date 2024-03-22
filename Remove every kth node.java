class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
        if (k==1){
            return null;
        }
        Node current=head;
        int c=1;
        Node prev=null;
        while(current!=null){
            if (c%k==0){
                prev.next=current.next;
                current=current.next;
                c++;
                continue;
            }
            c++;
            prev=current;
            current=current.next;
        }
        return head;
        // for ()
	// Your code here	 
    }
}
