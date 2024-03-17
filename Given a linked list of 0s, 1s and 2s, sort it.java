class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        Node current=head;
        int countzero=0;
        int countone=0;
        int counttwo=0;
        while(current!=null){
            if (current.data==0){
                countzero++;
                current=current.next;
                continue;
            }
            else if (current.data==1){
                countone++;
                current=current.next;
                continue;
            }
            counttwo++;
            current=current.next;
        }
        current=head;
        while (countzero>0){
            current.data=0;
            current=current.next;
            countzero--;
        }
        while (countone>0){
            current.data=1;
            current=current.next;
            countone--;
        }
        while (counttwo>0){
            current.data=2;
            current=current.next;
            counttwo--;
        }
        return head;
        // add your code here
    }
}


