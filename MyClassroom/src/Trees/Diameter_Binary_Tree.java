package Trees;

public class Diameter_Binary_Tree {

    static int Gdiameter=0;
    static int helper(BinaryTreeNode<Integer>root){

        if(root == null) return 0;

        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);
        int diameter = leftHeight+rightHeight+1;
        Gdiameter = Math.max(Gdiameter,diameter);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
        //Your code goes here
        if(root == null) return 0;

        helper(root);
        return Gdiameter;
    }
}
