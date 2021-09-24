package Trees;

public class Replace_Node_With_Depth {

    public static void changeToDepthTree2(BinaryTreeNode<Integer>root, int level){

        if(root == null) return;

        root.data = level;

         changeToDepthTree2(root.left , level+1);
         changeToDepthTree2(root.right,level+1);
    }

    public static void changeToDepthTree(BinaryTreeNode<Integer> root) {

        changeToDepthTree2(root , 0);
    }
}
