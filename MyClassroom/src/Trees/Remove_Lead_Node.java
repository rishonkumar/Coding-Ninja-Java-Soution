package Trees;

public class Remove_Lead_Node {

    public static BinaryTreeNode<Integer>removeLeaf(BinaryTreeNode<Integer>root){

        if(root == null) return null;

        if(root.left == null && root.right == null) return null; // only root is present

        root.left = removeLeaf(root.left);
        root.right = removeLeaf(root.right);
        return root;
    }
}
