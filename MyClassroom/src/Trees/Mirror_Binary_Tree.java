package Trees;

public class Mirror_Binary_Tree {
    public static void mirrorBinaryTree(BinaryTreeNode<Integer>root){

        if(root == null) return;

        mirrorBinaryTree(root.left);
        mirrorBinaryTree(root.right);
        BinaryTreeNode<Integer>temp = root.right;
        root.right = root.left;
        root.left = temp;

    }
}
