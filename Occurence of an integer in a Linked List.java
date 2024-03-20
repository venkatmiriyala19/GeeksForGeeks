class Solution
{
    public static int count(Node head, int key)
    {
        Node current=head;
        if(head==null){
            return 0;
        }
        int a=0;
        while(current!=null){
           if(current.data==key){
               a++;
           }
           current=current.next;
        }
        return a;
        //code here
    }
}
