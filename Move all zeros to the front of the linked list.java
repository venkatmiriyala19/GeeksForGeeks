class GfG{
    public Node moveZeroes(Node head){
        ArrayList<Integer> list=new ArrayList<>();
        Node current=head;
        int c=0;
        while(current!=null){
            if (current.data!=0){
            list.add(current.data);
            current=current.next;}
            else{
                c++;
                current=current.next;
            }
        }
        current=head;
        while(c>0){
            current.data=0;
            c--;
            current=current.next;
        }
        for (int element:list){
            current.data=element;
            current=current.next;
        }
        
        return head;
        //Your Code here.
        
    }
}
