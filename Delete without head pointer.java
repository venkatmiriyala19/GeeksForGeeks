class Solution
{
    void deleteNode(Node del_node)
    {
        // Node prev=null;
        Node temp=del_node.next;
        del_node.data=temp.data;
        del_node.next=temp.next;
        temp.next=null;
        
        
        
         // Your code here
    }
}

