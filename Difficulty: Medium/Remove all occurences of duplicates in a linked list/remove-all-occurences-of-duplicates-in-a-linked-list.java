//{ Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GFG {
    Node head;
    Node tail;

    public void addToTheLast(Node node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }

    void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int N = sc.nextInt();
            GFG llist = new GFG();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < N; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            Solution ob = new Solution();
            head = ob.removeAllDuplicates(llist.head);
            llist.printList(head);

            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public Node removeAllDuplicates(Node head) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        Node current=head;
        while(current!=null){
            if (freq.containsKey(current.data)){
                freq.put(current.data,freq.get(current.data)+1);
            }
            else{
                freq.put(current.data,1);
            }
            current=current.next;
        }
        Node dummy=new Node(-1);
        dummy.next=head;
        current=head;
        ArrayList<Integer> arr=new ArrayList<>();
        for(Integer key:freq.keySet()){
            if(freq.get(key)==1){
                arr.add(key);
            }
        }
        Collections.sort(arr);
        if(arr.isEmpty()) return null;
        Node prev=null;
        for(Integer ele:arr){
            current.data=ele;
            prev=current;
            current=current.next;
        }
        prev.next=null;
        return head;
        // code here
    }
}