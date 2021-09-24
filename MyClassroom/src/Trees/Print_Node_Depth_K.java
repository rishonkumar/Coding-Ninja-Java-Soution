package Trees;

public class Print_Node_Depth_K {

    public static void printAtdepthK(BinaryTreeNode<Integer>root, int k) {

        //Base Case
        if(root == null | k<0){
            return;
        }

        if(k==0) {
            System.out.println(root.data);
            return;
        }

        //recursively traversing
        printAtdepthK(root.left, k-1);
        printAtdepthK(root.right, k-1);
    }
}
