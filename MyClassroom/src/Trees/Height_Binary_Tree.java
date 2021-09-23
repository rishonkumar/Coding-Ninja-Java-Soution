package Trees;

public class Height_Binary_Tree {
    public static int height(BinaryTreeNode<Integer> root) {
        if(root == null) return 0;

        else{
            int lheight = height(root.left);
            int rheight = height(root.right);

            if(lheight > rheight) return lheight+1;
            else  return rheight+1;
        }

    }

    public static int height2(BinaryTreeNode<Integer> root) {
        if(root == null) return 0;

        return 1 + Math.max(height2(root.left) , height2(root.right));
    }
}
