package Trees;

public class Balanced_Tree {

    public static int height(BinaryTreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight, rightHeight);
    }

    public static boolean isBalanced(BinaryTreeNode<Integer> root) {
        if (root == null) { //if root is null then true
            return true;
        }
        int leftHeight = height(root.left); //cal the left height
        int rightHeight = height(root.right);//cal the right height

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false; //if greater than 1 mean not balanced
        }
        boolean isLeftBalanced = isBalanced(root.left); //to check the left
        boolean isRightBalanced = isBalanced(root.right); //to check the right

        return isLeftBalanced && isRightBalanced; //if both satisfy return true
    }
}
