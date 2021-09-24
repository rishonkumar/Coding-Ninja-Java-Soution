package Trees;

public class Node_Present {


    public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {

        if (root == null) return false;

        if (root.data == x) return true;

        // then recur on left subtree /
        boolean res1 = isNodePresent(root.left, x);
        if (res1) return true;

        // node is not found in left,
        // so recur on right subtree /
        boolean res2 = isNodePresent(root.right, x);

        return res2;
    }

    // METHOD 2

    public static boolean isNodePresent2(BinaryTreeNode<Integer> root, int x) {

        if (root == null) {
            return false;
        }

        if (root.data.equals(x)) {
            return true;
        }

        return isNodePresent2(root.left, x) || isNodePresent2(root.right, x);
    }
}
