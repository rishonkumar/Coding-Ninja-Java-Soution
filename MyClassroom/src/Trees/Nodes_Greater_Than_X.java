package Trees;

public class Nodes_Greater_Than_X {

    public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
        if(root == null) return 0;

        int count = 0;
        if(root.data > x){
            count++;
        }

       if(root.left != null){
           count = count+countNodesGreaterThanX(root.left,x);
       }
       if(root.right != null){
           count = count+countNodesGreaterThanX(root.right,x);
       }
       return count;
    }
}
