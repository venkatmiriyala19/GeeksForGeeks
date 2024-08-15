//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

class GfG {
    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int n = str.length;
            Node head = new Node(Integer.parseInt(str[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(str[i]));
                tail = tail.next;
            }
            Solution obj = new Solution();
            head = obj.addOne(head);
            printList(head);
        }
    }
}
// } Driver Code Ends


/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node reversell(Node head){
        Node curr = head; 
        Node prev = null;
        Node next;
        while(curr != null){
            next = curr.next; //storing curr.next address in next var
            curr.next = prev; //now curr will point prev instead of pointing next
            prev = curr;//prev have address of curr now
            curr = next;//curr will point next now
        }
        return prev;//bcz of curr is null now and head is addressed by prev var
    }
    public Node addOne(Node head) {
        // code here.
        head = reversell(head);
        Node temp = head;
        while(temp != null){
            if(temp.data == 9){//special case 9
                 temp.data = 0;
                if(temp.next == null){//if it is last digit like 999->1000
                    Node newNode = new Node(1);
                    temp.next = newNode;
                    break;
                }
            }else if(temp.data < 9){//other cases
                temp.data = temp.data+1;
                break;//not necessary to traverse whole list if work done
            }
            temp = temp.next;
        }
        return reversell(head);//return reverse of modified linkedlist
    }
}
