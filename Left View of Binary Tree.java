class Tree
{
     static ArrayList<Integer> arr = new ArrayList<>();
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
        arr.clear();
        leftViewHelper(root,1);
        return arr;
      // Your code here
    }
    public static void leftViewHelper(Node root,int level){
        if (root==null){
            return;
        }
        if (arr.size()<level){
            arr.add(root.data);
        }
        leftViewHelper(root.left,level+1);
        leftViewHelper(root.right,level+1);
    }
}
