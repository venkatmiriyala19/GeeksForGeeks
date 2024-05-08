class Solution
{
    int val=-1;
    //Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root)
    {
        if (root==null) return true;
        boolean leftFlag=isBST(root.left);
        if (root.data<=val) return false;
        val=root.data;
        boolean rightFlag=isBST(root.right);
        return leftFlag && rightFlag;
        
        // code here.
    }
}
