/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
	    QueueNode temp=new QueueNode(a);
	    if(front==null){
	        front=temp;
	        rear=temp;
	    }else{
	        rear.next=temp;
	        rear=rear.next;
	    }
        // Your code here
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front==null){
	        return -1;
	    }
	    int x=front.data;
	    front=front.next;
	    return x;
        // Your code here
	}
}




