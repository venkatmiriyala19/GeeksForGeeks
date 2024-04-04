class Solution
{
	Node sortList(Node head) {
	    ArrayList<Integer> list=new ArrayList<>();
	    Node current=head;
	    while(current!=null){
	        list.add(current.data);
	        current=current.next;
	    }
	    Collections.sort(list);
	    current=head;
	    for (Integer element:list){
	        current.data=element;
	        current=current.next;
	    }
	    return head;
		// Your code here
	}
}
