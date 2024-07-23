//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.math.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N')) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the curr node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the curr node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the curr node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root1 = buildTree(s);

            s = br.readLine();
            Node root2 = buildTree(s);

            Solution T = new Solution();
            List<Integer> ans = T.merge(root1, root2);
            for (int i = 0; i < ans.size(); i++) System.out.print(ans.get(i) + " ");
            System.out.println();

            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}

*/
class Solution {
    public void solve(Node root,List<Integer>ls){
        if(root==null)return;
        solve(root.left,ls);
        ls.add(root.data);
        solve(root.right,ls);
    }
    public List<Integer> merge(Node root1, Node root2) {
        List<Integer>ls1=new ArrayList<>();
        List<Integer>ls2=new ArrayList<>();
         List<Integer>ans=new ArrayList<>();
        solve(root1,ls1);
        solve(root2,ls2);
        int n=ls1.size();int m=ls2.size();int i=0;int j=0;
        while(i<n || j<m){
            if(i<n && j<m && ls2.get(j)>=ls1.get(i)){
                ans.add(ls1.get(i++));
            }
            else if(i<n && j<m && ls2.get(j)<ls1.get(i)){
                ans.add(ls2.get(j++));
            }
            else if(i<n){
                 ans.add(ls1.get(i++));
            }
            else{
                 ans.add(ls2.get(j++));
            }
        }
        return ans;
    }
}
