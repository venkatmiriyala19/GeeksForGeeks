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

class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
}

public class GFG {
    public static void printList(Node head) {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }
    }

    public static Node newNode(int key) { return new Node(key); }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String input = br.readLine();
            String[] tokens = input.split(" ");
            int[] arr = Arrays.stream(tokens).mapToInt(Integer::parseInt).toArray();

            Node temp = null, head = null;
            if (arr.length > 0) {
                head = new Node(arr[0]);
                temp = head;
                for (int i = 1; i < arr.length; i++) {
                    temp.next = new Node(arr[i]);
                    temp = temp.next;
                }
                temp.next = head;
            }

            Solution ob = new Solution();
            Pair<Node, Node> result = ob.splitList(head);
            Node head1 = result.first;
            Node head2 = result.second;
            printList(head1);
            printList(head2);
        }
    }
}

// } Driver Code Ends


/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    public Pair<Node, Node> splitList(Node head) {
        if (head == null || head.next == head) {
            return new Pair<>(head, head); // If the list is empty or has one node, return the same node as both halves.
        }

        int n = 1;
        Node curr = head.next;

        // Count the number of nodes in the list
        while (curr != head) {
            n++;
            curr = curr.next;
        }

        curr = head;
        Node prev = null;
        int mid=0;
        if (n%2==0){
        mid = n / 2;}
        else { mid=(n/2)+1;}

        // Traverse to the midpoint of the list
        while (mid > 0) {
            prev = curr;
            curr = curr.next;
            mid--;
        }

        // Split the list into two halves
        if (prev != null) {
            prev.next = head; // Terminate the first half by pointing back to the head
        }

        Node secondHalfHead = curr;
        prev = curr;

        // Traverse to the end of the second half to complete the circular nature
        while (prev.next != head) {
            prev = prev.next;
        }
        prev.next = secondHalfHead; // Terminate the second half by pointing back to its head

        // Return the heads of the two halves as a pair
        return new Pair<>(head, secondHalfHead);
    }
}