//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

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

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
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
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }


class Info {
    int minVal; // Minimum value in the subtree
    int maxVal; // Maximum value in the subtree
    int size;   // Size of the subtree if it is a BST

    Info(int mi, int ma, int s) {
        minVal = mi;
        maxVal = ma;
        size = s;
    }
}

class Solution {
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        return solve(root).size;
    }

    static Info solve(Node root) {
        if (root == null) return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        
        Info left = solve(root.left);
        Info right = solve(root.right);
        
        // Check if the current subtree is a BST
        if (left.maxVal < root.data && root.data < right.minVal) {
            return new Info(Math.min(root.data, left.minVal), Math.max(root.data, right.maxVal), left.size + right.size + 1);
        }
        
        // If not a BST, return the maximum size of left or right subtree
        return new Info(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.size, right.size));
    }
}