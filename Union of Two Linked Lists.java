class Sol
{
	public static Node findUnion(Node head1,Node head2)
	{
	    ArrayList<Integer> list= new ArrayList<>();
	    HashSet<Integer> set=new HashSet<>();
	    Node current=head1;
	    while(current!=null){
	        if (set.contains(current.data)){
	            current=current.next;
	            continue;
	        }
	        set.add(current.data);
	        list.add(current.data);
	        current=current.next;
	    }
	    current=head2;
	    while(current!=null){
	        if (set.contains(current.data)){
	            current=current.next;
	            continue;
	        }
	        set.add(current.data);
	        list.add(current.data);
	        current=current.next;
	    }
	    current=head1;
	    while(current.next!=null){
	       current=current.next;
	    }
	    current.next=head2;
	    current=head1;
	    Node prev=null;
	    Collections.sort(list);
	    for (Integer element:list){
	        current.data=element;
	        prev=current;
	        current=current.next;
	    }
	   // System.out.println(list);
	    prev.next=null;
	    return head1;
	    //Add your code here.
	}
}
