class Solution
{
   long DecimalValue(Node head)
   {
    
 	Node current=head;
 	long mod=(long)1e9+7;
 	if (head==null){
 	    return 0;
 	}
 	long num=0;
 	while(current!=null){
 	    num=(num*2+current.data)%mod;
 	    current=current.next;
 	}
 	return num;
   }
}
