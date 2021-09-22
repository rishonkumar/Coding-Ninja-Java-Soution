package Trees;

public class Pre_Order {

    public static void preOrder(BinaryTreeNode<Integer> root) {
        if(root == null) return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }
}
