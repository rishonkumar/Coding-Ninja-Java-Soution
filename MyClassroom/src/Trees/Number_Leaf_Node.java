package Trees;

public class Number_Leaf_Node {

    public static int numLeave(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) //means it a single node
        {
            return 1;
        }

        //if both condition doesn't satisfy then it means root is not a leaf
        return numLeave(root.left) + numLeave(root.right);
    }
}
