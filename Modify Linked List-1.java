class Solution
{
    public static Node modifyTheList(Node head)
    {
        Node current=head;
        ArrayList<Integer> list=new ArrayList<>();
        int count=0;
        while(current!=null){
            list.add(current.data);
            current=current.next;
            count++;
        }
        int half=count/2;
        current=head;
        int lastIndex=count-1;
        while(half>0){
            current.data=list.get(lastIndex)-current.data;
            lastIndex--;
            half--;
            current=current.next;
        }
        if (count%2==0){
            half=1;
        }
        while(half<=count/2){
            current.data=list.get(lastIndex);
            lastIndex--;
            half++;
            current=current.next;
        }
        return head;

    }
}
