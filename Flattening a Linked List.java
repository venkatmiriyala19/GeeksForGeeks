class GfG
{
    Node flatten(Node root)
    {
        Node current=root;
        ArrayList<Integer> list=new ArrayList<>();
        while(current!=null){
            list.add(current.data);
            Node b=current.bottom;
            while(b!=null){
                list.add(b.data);
                b=b.bottom;
            }
            current=current.next;
        }
        Collections.sort(list);
        Node result=null;
        current=null;
        for(Integer element:list){
            Node temp=new Node(element);
            if(result==null){
                result=temp;
                current=result;
            }
            else{
                current.bottom=temp;
                current=current.bottom;
            }
        }
        return result;
	// Your code here
    }
}
